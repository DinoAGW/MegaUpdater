import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import de.zbmed.utilities.Drive;
import de.zbmed.utilities.Utilities;
import de.zbmed.utilities.WebServices;
import de.zbmed.utilities.XmlHelper;

public class MetadatenScanner {
	private static final String fs = Drive.fs;

	private static void scan() throws Exception {
		Set<String> felder = new HashSet<>();
		Map<String, Integer> anzahl = new HashMap<>();
		Map<String, String> beispielIePid = new HashMap<>();
		File csvFile = new File(Drive.home + fs + "workspace" + fs + "2025_08_06_IEListe.csv");
		if (!csvFile.exists()) {
			throw new Exception("CSV Datei nicht gefunden");
		}
		String[][] IEListe = Drive.readCsvFileMehrspaltig(csvFile);
		System.out.println(IEListe.length + " x " + IEListe[0].length);
		Drive.printZeile(IEListe[0]);
		String startWith = null;
		for (int i = 1; i < IEListe.length; ++i) {
			String iePid = IEListe[i][0];
			String uda = IEListe[i][4];
			if (startWith == null || startWith.contentEquals(uda)) {
				startWith = null;
			} else {
				continue;
			}
			if (!uda.startsWith("GMSKON_"))
				continue;
//			if (!Character.isDigit(uda.charAt(7)))
//				continue;
//			if (!uda.startsWith("GMSHTA_")) continue;
//			if (!uda.startsWith("GMSJN_")) continue;
//			if (!uda.startsWith("FRL_")) continue;
			System.out.println(iePid + " -> " + uda);
			String metsString = WebServices.getIE("prod", iePid);
//			System.out.println(metsString);
			Document doc = XmlHelper.parse(metsString);
			XmlHelper.removeEmptyNodes(doc);
			Node node = doc;
			node = XmlHelper.getFirstChildByName(node, "mets:mets");
			node = XmlHelper.getFirstChildByNameWithAttrValue(node, "mets:dmdSec", "ID", "ie-dmd");
			node = XmlHelper.getFirstChildByName(node, "mets:mdWrap");
			node = XmlHelper.getFirstChildByName(node, "mets:xmlData");
			node = XmlHelper.getFirstChildByName(node, "dc:record");
			NodeList metadatenNodes = node.getChildNodes();
			for (int j = 0; j < metadatenNodes.getLength(); ++j) {
				Node metadatumNode = metadatenNodes.item(j);
//				System.out.println(metadatumNode.getNodeName() + " = " + metadatumNode.getTextContent());
				String feld = metadatumNode.getNodeName();
				NamedNodeMap attributes = metadatumNode.getAttributes();
				for (int k = 0; k < attributes.getLength(); ++k) {
					Node attr = attributes.item(k);
					if (attr.getNodeName().contentEquals("xsi:type")) {
						feld += "@" + attr.getTextContent();
					}
				}
				if (felder.add(feld)) {
					beispielIePid.put(feld, iePid);
				}
				if (anzahl.containsKey(feld)) {
					anzahl.put(feld, anzahl.get(feld) + 1);
				} else {
					anzahl.put(feld, 1);
				}
			}
//			break;
		}
		System.out.println("Feld,Anzahl,Beispiel IE PID");
		for (String feld : felder) {
			System.out.println(feld + "," + anzahl.get(feld) + "," + beispielIePid.get(feld));
		}
	}

	private static void korrigiereEins(String iePid, String rosettaInstance) throws Exception {
		String metsString = WebServices.getIE(rosettaInstance, iePid);
		Document doc = XmlHelper.parse(metsString);
		XmlHelper.removeEmptyNodes(doc);
		Node node = doc;
		node = XmlHelper.getFirstChildByName(node, "mets:mets");
		node = XmlHelper.getFirstChildByNameWithAttrValue(node, "mets:dmdSec", "ID", "ie-dmd");
		node = XmlHelper.getFirstChildByName(node, "mets:mdWrap");
		node = XmlHelper.getFirstChildByName(node, "mets:xmlData");
		node = XmlHelper.getFirstChildByName(node, "dc:record");
		NodeList metadatenNodes = node.getChildNodes();
		boolean changesWereMade = false;
		boolean anderesAttribut = false;
		for (int j = 0; j < metadatenNodes.getLength(); ++j) {
			Node metadatumNode = metadatenNodes.item(j);
			String feld = metadatumNode.getNodeName();
			NamedNodeMap attributes = metadatumNode.getAttributes();
			for (int k = 0; k < attributes.getLength(); ++k) {
				Node attr = attributes.item(k);
				if (attr.getNodeName().contentEquals("xsi:type")) {
					feld += "@" + attr.getTextContent();
				} else if (attr.getNodeName().contentEquals("xml:lang")) {
					if (attributes.getLength() > 1)
						throw new Exception("Mehr als ein Attribut pro Metadatum");
				} else {
					throw new Exception("Unerwartetes Attribut: " + attr.getNodeName() + " = " + attr.getTextContent());
				}
			}
			if (feld.contentEquals("dc:isPartof")) {
				if (!changesWereMade) {
					metsString = XmlHelper.getStringFromDocumentWithIndention(doc);
					changesWereMade = true;
				}
				Node newNode = doc.createElement("dcterms:isPartOf");
				newNode.setTextContent(metadatumNode.getTextContent());
				node.replaceChild(newNode, metadatumNode);
			}
			if (feld.contentEquals("dc:identifier@hbz:hbzId")) {
				if (!changesWereMade) {
					metsString = XmlHelper.getStringFromDocumentWithIndention(doc);
					changesWereMade = true;
				}
				metadatumNode.getAttributes().removeNamedItem("xsi:type");
			}
			if (feld.contentEquals("dc:identifier@doi:doi")) {
				if (!changesWereMade) {
					metsString = XmlHelper.getStringFromDocumentWithIndention(doc);
					changesWereMade = true;
				}
				metadatumNode.getAttributes().removeNamedItem("xsi:type");
			}
			if (feld.contentEquals("dc:identifier@urn:urn")) {
				if (!changesWereMade) {
					metsString = XmlHelper.getStringFromDocumentWithIndention(doc);
					changesWereMade = true;
				}
				metadatumNode.getAttributes().removeNamedItem("xsi:type");
			}
		}
		if (changesWereMade) {
			Utilities.printDiff(metsString, XmlHelper.getStringFromDocumentWithIndention(doc));
//			System.out.println(XmlHelper.getStringFromDocumentWithIndention(doc));
//			WebServices.lockIE(iePid, rosettaInstance);
//			WebServices.rollbackIE(iePid, rosettaInstance);
			WebServices.updateMD(iePid, rosettaInstance, doc, true);
			System.out.println("IE PID " + iePid + " geändert");
			if (anderesAttribut)
				throw new Exception("Prüf das lieber nochmal");
		}
	}

	private static void korrigiere() throws Exception {
		File csvFile = new File(Drive.home + fs + "workspace" + fs + "2025_08_06_IEListe.csv");
		final String rosettaInstance = "prod";
		if (!csvFile.exists()) {
			throw new Exception("CSV Datei nicht gefunden");
		}
		String[][] IEListe = Drive.readCsvFileMehrspaltig(csvFile);
		String startWith = null;
		startWith = "IE2721857";
		for (int i = 1; i < IEListe.length; ++i) {
			String iePid = IEListe[i][0];
			String uda = IEListe[i][4];
			if (startWith == null || startWith.contentEquals(iePid)) {
				if (startWith != null) {
					startWith = null;
					continue;
				}
			} else {
				continue;
			}
			if (!uda.startsWith("GMSKON_"))
				continue;
//			if (!Character.isDigit(uda.charAt(7)))
//				continue;
			System.out.println(iePid + " -> " + uda);
			korrigiereEins(iePid, rosettaInstance);
//			break;
		}
	}

	public static void main(String[] args) throws Exception {
//		scan();
		korrigiere();
		System.out.println("MetadatenScanner Ende");
	}
}
