import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import de.zbmed.utilities.Drive;
import de.zbmed.utilities.Url;
import de.zbmed.utilities.WebServices;
import de.zbmed.utilities.XmlHelper;

public class GmsSourceMdHinzufuegen {
	private static final String fs = Drive.fs;
	private static final String home = System.getProperty("user.home");
	private static final String workspace = home.concat(fs).concat("workspace").concat(fs);

	public static void main(String[] args) throws Exception {
//		verarbeiteCsv();
		verarbeiteEins("IE1493172", "GMSKON_03dgpp001", "dev");
		System.out.println("GmsSourceMdHinzufuegen Ende");
	}

	private static void verarbeiteCsv() throws Exception {
			File csvFile = new File(workspace.concat("kurratc Kongresse Before 2020.csv"));
			final String rosettaInstance = "prod";
			if (!csvFile.exists()) {
				throw new Exception("CSV Datei nicht gefunden");
			}
			String[][] IEListe = Drive.readCsvFileMehrspaltig(csvFile);
	//		System.out.println(IEListe.length + " x " + IEListe[0].length);
	//		Drive.printZeile(IEListe[0]);
			String startWith = null;
	//		startWith = "IE2714187";
			for (int i = 1; i < IEListe.length; ++i) {
				String iePid = IEListe[i][0];
				String uda = IEListe[i][4];
				if (startWith == null || startWith.contentEquals(iePid)) {
					if (startWith != null) {
						startWith = null;
						continue;// optional
					}
				} else {
					continue;
				}
				verarbeiteEins(iePid, uda, rosettaInstance);
				throw new Exception("Abbruch");
			}
		}

	private static void verarbeiteEins(String iePid, String uda, String rosettaInstance) throws Exception {
			System.out.println(iePid + " -> " + uda);
			boolean istUeberordnung = !Character.isDigit(uda.charAt(7));
	//		if (istUeberordnung) System.out.println("Ist Überordnung");
			String metsString = WebServices.getIE(rosettaInstance, iePid);
			Document doc = XmlHelper.parse(metsString);
			XmlHelper.removeEmptyNodes(doc);
			Node node = doc;
			String sourceMdDateiname = istUeberordnung ? "SRU.xml" : "OAI.xml";
			if (hatDateiEndetMit(node, sourceMdDateiname))
				return;
			Document md = istUeberordnung ? getSRU(node) : getOAI(uda);
			System.out.println(XmlHelper.getStringFromDocumentWithIndention(md));
		}

	private static boolean hatDateiEndetMit(Object o, String dateiname) throws Exception {
			boolean ret = false;
			Node node;
			if (o instanceof String) {
				Document doc = XmlHelper.parse((String) o);
				XmlHelper.removeEmptyNodes(doc);
				node = doc;
			} else if (o instanceof Node) {
				node = (Node) o;
			} else {
				throw new Exception("Object sollte String oder Node sein");
			}
			node = XmlHelper.getFirstChildByName(node, "mets:mets");
			node = XmlHelper.getFirstChildByName(node, "mets:fileSec");
			node = XmlHelper.getFirstChildByName(node, "mets:fileGrp");
	//		XmlHelper.printChildren(node);
			NodeList nl = node.getChildNodes();
			for (int i1 = 0; i1 < nl.getLength(); ++i1) {
				Node child = nl.item(i1);
				child = XmlHelper.getFirstChildByName(child, "mets:FLocat");
	//			XmlHelper.printChildren(child);
				String href = child.getAttributes().getNamedItem("xlin:href").getTextContent();
	//			System.out.println(href);
				if(href.endsWith(dateiname)) {
					ret = true;
				}
			}
	//		XmlHelper.printChildren(node);
			return ret;
		}

	private static Document getSRU(Node node) throws Exception {
			node = XmlHelper.getFirstChildByName(node, "mets:mets");
			node = XmlHelper.getFirstChildByNameWithAttrValue(node, "mets:dmdSec", "ID", "ie-dmd");
			node = XmlHelper.getFirstChildByName(node, "mets:mdWrap");
			node = XmlHelper.getFirstChildByName(node, "mets:xmlData");
			node = XmlHelper.getFirstChildByName(node, "dc:record");
			NodeList nl = node.getChildNodes();
			String HT = null;
			for (int i1 = 0; i1 < nl.getLength(); ++i1) {
				Node child = nl.item(i1);
				if (child.getNodeName().contentEquals("dc:identifier") && child.getTextContent().startsWith("HT0")) {
					if (HT == null) {
						HT = child.getTextContent();
					} else {
						throw new Exception("Zwei HT-Nummern gefunden");
					}
				}
			}
			if (HT == null) {
				throw new Exception("Keine HT-Nummer gefunden");
			}
	//		System.out.println(HT);
			String alma = ht2alma(HT);
			Document doc = XmlHelper.parse(Url.getWebsite(alma));
			XmlHelper.removeEmptyNodes(doc);
			return doc;
		}

	public static String ht2alma(String HT) {
		return "https://eu04.alma.exlibrisgroup.com/view/sru/49HBZ_ZBM?version=1.2&operation=searchRetrieve&recordSchema=dc&query=alma.other_system_number_035_a_exact=(DE-605)".concat(HT);
	}

	private static Document getOAI(String uda) throws Exception {
		String kuerzel = uda.substring(7);
		String oai = kuerzel2oai(kuerzel);
		Document doc = XmlHelper.parse(Url.getWebsite(oai));
		XmlHelper.removeEmptyNodes(doc);
		return doc;
	}

	private static String kuerzel2oai(String kuerzel) {
		return "https://portal.dimdi.de/oai-gms/OAIHandler?verb=GetRecord&metadataPrefix=oai_dc&identifier=oai:oai-gms.dimdi.de:GM"
				.concat(kuerzel);
	}
}
