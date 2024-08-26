package de.zbmed.rosetta;

import java.nio.charset.StandardCharsets;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import de.zbmed.utilities.*;

public class SRU {

	public static String searchIE(String rosettaInstance, String query) throws Exception {
		String[] command = new String[4];
		command[0] = "curl";
//		command[1] = "-u";
//		command[2] = "'" + getUsername(rosettaInstance).concat(":").concat(getPassword(rosettaInstance)) + "'";
		command[1] = "-H";
		command[2] = "Authorization: ".concat(Authentification.getAuthToken(rosettaInstance));
		command[3] = Custom.getSRU_URL(rosettaInstance)
				.concat("?version=1.2&auth=local&operation=searchRetrieve&query=").concat(query)
				.concat("&maximumRecords=10000&recordSchema=dc");
//		System.out.println(String.join(" ", command));
		ProcessBuilder pb = new ProcessBuilder(command);
		Process p = pb.start();
//		p.getErrorStream().readAllBytes();
		String output = new String(p.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
		p.waitFor();
		int exitCode;
		if ((exitCode = p.exitValue()) != 0) {
			throw new Exception("Curl endete mit exitCode = " + exitCode);
		}
		return output;
	}

	public static String searchIEByUserDefinedA(String rosettaInstance, String userDefinedA) throws Exception {
		return searchIE(rosettaInstance, "IE.generalIECharacteristics.UserDefinedA=".concat(userDefinedA));
	}

	public static Document parse(String xml) throws Exception {
		return XmlHelper.parse(xml);
	}

	public static int anzahlAntworten(Document doc) throws Exception {
		Node n1 = XmlHelper.getFirstChildByName(doc, "searchRetrieveResponse");
		Node n2 = XmlHelper.getFirstChildByName(n1, "numberOfRecords");
		String text = n2.getTextContent();
		return Integer.parseInt(text);
	}

	public static void checkGenauEins(Document doc) throws Exception {
		int anz = anzahlAntworten(doc);
		if (anz != 1)
			throw new Exception("SRU Antwort hat ungleich 1 Antworten: " + anz);
	}

	public static Node getAntwort(Document doc) throws Exception {
		checkGenauEins(doc);
		Node n1 = XmlHelper.getFirstChildByName(doc, "searchRetrieveResponse");
		Node n2 = XmlHelper.getFirstChildByName(n1, "records");
		Node n3 = XmlHelper.getFirstChildByName(n2, "record");
		Node n4 = XmlHelper.getFirstChildByName(n3, "recordData");
		Node n5 = XmlHelper.getFirstChildByName(n4, "dc:record");
		return n5;
	}

	public static String getIePid(Node antwort) throws Exception {
		Node n1 = XmlHelper.getFirstChildByNameWithAttrValue(antwort, "dc:identifier", "xsi:type", "PID");
		return n1.getTextContent();
	}

	public static String getIePidToUserDefinedA(String rosettaInstance, String userDefinedA) throws Exception {
		String sruAntwortString = searchIEByUserDefinedA(rosettaInstance, userDefinedA);
		Document sruAntwort = parse(sruAntwortString);
		Node antwort = getAntwort(sruAntwort);
		return getIePid(antwort);
	}

	public static void main(String[] args) throws Exception {
//		System.out.println(getAuthToken("dev"));
		String iePid = getIePidToUserDefinedA("prod", "17bbag20");
		System.out.println(iePid);
		System.out.println(WebServices.getIE("prod", iePid));
	}

}
