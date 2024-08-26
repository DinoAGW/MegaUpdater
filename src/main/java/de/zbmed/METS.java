package de.zbmed;

import java.io.File;
import java.nio.file.Files;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import de.zbmed.rosetta.SRU;
import de.zbmed.utilities.XmlHelper;

public class METS implements SIP{
	String ingestDateiContent;
	Document metsDoc;
	String uda;
	String iePid;
	
	public String getUDA() {
		return uda;
	}
	
	public String getIePid() {
		return iePid;
	}
	
	public METS(String rosettaInstance, File ingestDatei) throws Exception {
		ingestDateiContent = Files.readString(ingestDatei.toPath());
		metsDoc = XmlHelper.parse(ingestDateiContent);
		uda = getUserDefinedA();
		iePid = SRU.getIePidToUserDefinedA(rosettaInstance, uda);
	}
	
	public String getUserDefinedA() throws Exception {
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
	
	public Node getIeMetadata() {
		Node node = metsDoc;
		node = XmlHelper.getFirstChildByName(node, "mets:mets");
		node = XmlHelper.getFirstChildByNameWithAttrValue(node, "mets:dmdSec", "ID", "ie-dmd");
		node = XmlHelper.getFirstChildByName(node, "mets:mdWrap");
		node = XmlHelper.getFirstChildByName(node, "mets:xmlData");
		return XmlHelper.getFirstChildByName(node, "dc:record");
	}
}
