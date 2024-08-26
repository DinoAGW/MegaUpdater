package de.zbmed.mets;

import java.io.File;
import java.nio.file.Files;

import org.w3c.dom.*;

import de.zbmed.rosetta.SRU;
import de.zbmed.utilities.XmlHelper;

@Deprecated
public class MetsUpdater {
	
	public static String getUserDefinedA(Document metsDoc) throws Exception {
//		String ingestDateiContent = XmlHelper.getStringFromDocumentWithIndention(metsDoc);
//		System.out.println(ingestDateiContent);
		Node node = metsDoc;
		node = XmlHelper.getFirstChildByName(node, "mets:mets");
		node = XmlHelper.getFirstChildByNameWithAttrValue(node, "mets:amdSec", "ID", "ie-amd");
		node = XmlHelper.getFirstChildByNameWithAttrValue(node, "mets:techMD", "ID", "ie-amd-tech");
		node = XmlHelper.getFirstChildByName(node, "mets:mdWrap");
		node = XmlHelper.getFirstChildByName(node, "mets:xmlData");
		node = XmlHelper.getFirstChildByName(node, "dnx");
		node = XmlHelper.getFirstChildByNameWithAttrValue(node, "section", "id", "generalIECharacteristics");
		node = XmlHelper.getFirstChildByName(node, "record");
		node = XmlHelper.getFirstChildByNameWithAttrValue(node, "key", "id", "UserDefinedA");
		return node.getTextContent();
	}
	
	public static void bearbeite(String rosettaInstance, File contentFolder, File ingestDatei) throws Exception {
		String ingestDateiContent = Files.readString(ingestDatei.toPath());
		Document metsDoc = XmlHelper.parse(ingestDateiContent);
		String uda = getUserDefinedA(metsDoc);
		String iePid = SRU.getIePidToUserDefinedA(rosettaInstance, uda);
		System.out.println(ingestDatei.getPath() + " -> " + uda + " -> " + iePid);
	}

	public static void main(String[] args) throws Exception {
		String rosettaInstance = "test";
		File contentFolder = new File("/home/wutschka/MegaUpdater/Test/altra2024_24altra06_dateien_gelöscht");
		File ingestDatei = new File("/home/wutschka/MegaUpdater/Test/altra2024_24altra06_dateien_gelöscht/content/ie1.xml");
		bearbeite(rosettaInstance, contentFolder, ingestDatei);
	}
}
