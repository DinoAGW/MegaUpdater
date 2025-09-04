import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Stack;

import org.apache.commons.codec.digest.DigestUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.exlibris.dps.Fixity;
import com.exlibris.dps.MetaData;
import com.exlibris.dps.Operation;
import com.exlibris.dps.RepresentationContent;

import de.zbmed.rosetta.Transferserver;
import de.zbmed.utilities.Drive;
import de.zbmed.utilities.Url;
import de.zbmed.utilities.WebServices;
import de.zbmed.utilities.XmlHelper;

public class GmsSourceMdHinzufuegen {
	private static final String fs = Drive.fs;
	private static final String home = System.getProperty("user.home");
	private static final String workspace = home.concat(fs).concat("workspace").concat(fs);
	private static Transferserver ts = null;

	public static void main(String[] args) throws Exception {
		ts = new Transferserver();
//		verarbeiteCsv();
		try {
			verarbeiteEins("IE1493172", "GMSKON_03dgpp001", "dev");
		} finally {
			ts.diconnect();
		}
		System.out.println("GmsSourceMdHinzufuegen Ende");
	}

	private static void verarbeiteCsv() throws Exception {
		File csvFile = new File(workspace.concat("kurratc Kongresse Before 2020.csv"));
		final String rosettaInstance = "prod";
		if (!csvFile.exists()) {
			throw new Exception("CSV Datei nicht gefunden");
		}
		String[][] IEListe = Drive.readCsvFileMehrspaltig(csvFile);
		// System.out.println(IEListe.length + " x " + IEListe[0].length);
		// Drive.printZeile(IEListe[0]);
		String startWith = null;
		// startWith = "IE2714187";
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
		// if (istUeberordnung) System.out.println("Ist Überordnung");
		String metsString = WebServices.getIE(rosettaInstance, iePid);
		Document doc = XmlHelper.parse(metsString);
		XmlHelper.removeEmptyNodes(doc);
		Node node = doc;
		String sourceMdDateiname = istUeberordnung ? "SRU.xml" : "OAI.xml";
		if (hatDateiEndetMit(doc, sourceMdDateiname))
			return;
		node = XmlHelper.getFirstChildByName(node, "mets:mets");
		node = XmlHelper.getFirstChildByName(node, "mets:fileSec");
		NodeList children = node.getChildNodes();
		if (children.getLength() != 1) {
			throw new Exception("Es sollte nur eine Repräsentation geben, bei " + iePid);
		}
		String repPid = children.item(0).getAttributes().getNamedItem("ID").getNodeValue();
		Document md = istUeberordnung ? getSRU(doc) : getOAI(uda);
		String mdString = XmlHelper.getStringFromDocumentWithIndention(md);
//		addSourceMD(iePid, repPid, mdString, sourceMdDateiname, rosettaInstance);
		updateMD(iePid, uda.substring(7), mdString, istUeberordnung, rosettaInstance);
	}

	private static void updateMD(String iePid, String kuerzel, String mdString, boolean istUeberordnung,
			String rosettaInstance) throws Exception {
		Element ieDmd = XmlHelper.newIeDmdElement();
		Document ieDmdDoc = ieDmd.getOwnerDocument();
		Document mdDoc = XmlHelper.parse(mdString);
		XmlHelper.removeEmptyNodes(mdDoc);
		Node node = mdDoc;
		if (istUeberordnung) {
			throw new Exception("Noch nicht etabliert");
		} else {
			// TODO: erstmal dc:creator aus GMS-XML ziehen
			node = XmlHelper.getFirstChildByName(node, "OAI-PMH");
			node = XmlHelper.getFirstChildByName(node, "GetRecord");
			node = XmlHelper.getFirstChildByName(node, "record");
			node = XmlHelper.getFirstChildByName(node, "metadata");
			node = XmlHelper.getFirstChildByName(node, "oai_dc:dc");
			String identifier = null;
			for (Node md : XmlHelper.asList(node.getChildNodes())) {
				String name = md.getNodeName();
				String text = md.getTextContent();
				if (name.contentEquals("dc:publisher")) {
					Element publisher = ieDmdDoc.createElement("dc:publisher");
					if (!text.contains(";")) {
						throw new Exception("Kein Semikolon gefunden");
					}
					if (text.indexOf(";") != text.lastIndexOf(";")) {
						throw new Exception("Mehr als ein Semikolon gefunden");
					}
					publisher.setTextContent(text.replace(';', ','));
					ieDmd.appendChild(publisher);
				} else if (name.contentEquals("dc:date")) {
					Element issued = ieDmdDoc.createElement("dcterms:issued");
					issued.setTextContent(text);
					ieDmd.appendChild(issued);
				} else if (!name.contentEquals("dc:creator") && !name.contentEquals("dc:description")) {
					ieDmd.appendChild(ieDmdDoc.importNode(md, true));
				}
				if (name.contentEquals("dc:identifier") && text.startsWith("http://www.egms.de/")) {
					if (identifier == null) {
						identifier = text;
					} else {
						throw new Exception("Abstract mit mehr als einem Identifier gefunden");
					}
				}
			}
			if (identifier == null) {
				throw new Exception("Abstract ohne Identifier gefunden");
			}
			// TODO: isPartOf hinzufügen
			// TODO: dc:identifier kurzID hinzufügen
			throw new Exception("reicht erstmal");
		}
	}

	private static void addSourceMD(String iePid, String repPid, String mdString, String sourceMdDateiname,
			String rosettaInstance) throws Exception {
		Path tempFile = Files.createTempFile("SourceMD", ".xml");
		Files.writeString(tempFile, mdString);
		String md5Hash = DigestUtils.md5Hex(mdString);
		String remotePath = "/exchange/lza/lza-zbmed/" + rosettaInstance + "/gms/";
		String remoteFilePath = remotePath + sourceMdDateiname;
		ts.uploadFile(tempFile.toAbsolutePath().toString(), remoteFilePath);
		List<RepresentationContent> representationContent = new Stack<>();
		RepresentationContent rc = new RepresentationContent();
		rc.setOperation(Operation.ADD);
		rc.setNewFile(remoteFilePath);
		rc.setFileOriginalPath("SourceMD/" + sourceMdDateiname);
		rc.setLabel("SourceMD/" + sourceMdDateiname);
		Fixity fix = new Fixity();
		fix.setAlgorithmType("MD5");
		fix.setValue(md5Hash);
		rc.setFixity(fix);
		representationContent.add(rc);
		List<MetaData> metadata = null;
		String submissionReason = "2025-08-22. dLZA. Automatisches Update durch MegaUpdater. Hinzufügen der SourceMD-Datei "
				+ sourceMdDateiname + " bei IEs mit creation date vor 2018.";
		long ripID = WebServices.updateRepresentation(representationContent, metadata, repPid, iePid, rosettaInstance,
				true, submissionReason);
		while (true) {
			Thread.sleep(1000);
			String ripStatus = WebServices.getRipStatus(ripID, rosettaInstance);
			if (ripStatus.contentEquals("Finished")) {
				break;
			} else {
//				System.out.println(ripStatus);
			}
		}
		ts.removeFile(remoteFilePath);
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
		// XmlHelper.printChildren(node);
		NodeList nl = node.getChildNodes();
		for (int i1 = 0; i1 < nl.getLength(); ++i1) {
			Node child = nl.item(i1);
			child = XmlHelper.getFirstChildByName(child, "mets:FLocat");
			// XmlHelper.printChildren(child);
			String href = child.getAttributes().getNamedItem("xlin:href").getTextContent();
			// System.out.println(href);
			if (href.endsWith(dateiname)) {
				ret = true;
			}
		}
		// XmlHelper.printChildren(node);
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
		// System.out.println(HT);
		String alma = ht2alma(HT);
		Document doc = XmlHelper.parse(Url.getWebsite(alma));
		XmlHelper.removeEmptyNodes(doc);
		return doc;
	}

	public static String ht2alma(String HT) {
		return "https://eu04.alma.exlibrisgroup.com/view/sru/49HBZ_ZBM?version=1.2&operation=searchRetrieve&recordSchema=dc&query=alma.other_system_number_035_a_exact=(DE-605)"
				.concat(HT);
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
