package de.zbmed.utilities;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlHelper {
	public static Document parse(String xml) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputStream is = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
		Document doc = builder.parse(is);
		doc.setXmlStandalone(true);
		return doc;
	}

	public static String getStringFromDocument(Document doc) throws Exception {
		DOMSource domSource = new DOMSource(doc);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(domSource, result);
		String ret = writer.toString();
		return ret;
	}

	public static void removeEmptyNodes(Node node) {
		NodeList nl = node.getChildNodes();
		// System.out.println(node.getNodeName() + " -> " + nl.getLength());
		for (int i = nl.getLength() - 1; i >= 0; --i) {
			Node childNode = nl.item(i);
			if (childNode.getNodeName() == "#text") {
				String content = childNode.getTextContent();
				boolean canBeDeleted = true;
				for (int j = 0; j < content.length(); ++j) {
					char test = content.charAt(j);
					if (test != ' ' && test != '\t' && test != '\r' && test != '\n') {
						canBeDeleted = false;
						break;
					}
				}
				if (canBeDeleted) {
					node.removeChild(childNode);
				} else {
//					System.out.println(
//							"'" + content + "' -> " + canBeDeleted + " (" + childNode.getChildNodes().getLength() + ")");
					removeEmptyNodes(childNode);
//					System.out.println(childNode.getNodeName() + ": '" + childNode.getTextContent() + "' -> "
//							+ childNode.getChildNodes().getLength() + ";" + childNode.getTextContent().length());
				}
			} else {
				removeEmptyNodes(childNode);
//				System.out.println(childNode.getNodeName() + ": '" + childNode.getTextContent() + "' -> "
//						+ childNode.getChildNodes().getLength() + ";" + childNode.getTextContent().length());
			}

		}
	}

	public static String getStringFromDocumentWithIndention(Document doc) throws Exception {
		// Leere Textnodes löschen
		removeEmptyNodes(doc);
		// Transformieren
		DOMSource domSource = new DOMSource(doc);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		transformer.transform(domSource, result);
		String ret = writer.toString();
		return ret;
	}

	public static String rosettaFixed(String ret) {
//		int stelle = ret.indexOf(">") + 1;
//		ret = ret.substring(0, stelle) + "\n  " + ret.substring(stelle);
		// Nötig aufgrund eines Bugs in Rosetta
		ret = ret.replaceAll("<dnx xmlns=\"http://www.exlibrisgroup.com/dps/dnx\" version=\"5.0\">",
				"<dnx version=\"5.0\" xmlns=\"http://www.exlibrisgroup.com/dps/dnx\">");
		return ret;
	}

	public static List<Node> asList(NodeList nl) {
		List<Node> ret = new Stack<>();
		for (int i = 0; i < nl.getLength(); ++i) {
			ret.add(nl.item(i));
		}
		return ret;
	}

	public static Node getFirstChildByName(Node parent, String name) {
		Node node = parent.getFirstChild();
		while (node != null) {
			if (node.getNodeName() != null && node.getNodeName().contentEquals(name)) {
				return node;
			}
			node = node.getNextSibling();
		}
		return null;
	}

	public static Node getFirstChildByNameWithAttrValue(Node parent, String name, String attr, String value) {
		Node node = parent.getFirstChild();
		while (node != null) {
			if (node.getNodeName() != null && node.getNodeName().contentEquals(name)) {
				NamedNodeMap nnm = node.getAttributes();
				Node item = nnm.getNamedItem(attr);
				if (item != null && item.getNodeValue().contentEquals(value)) {
					return node;
				}
			}
			node = node.getNextSibling();
		}
		return null;
	}

	public static Node getFirstChildByNameWithAttrStartsWithValue(Node parent, String name, String attr, String value) {
		Node node = parent.getFirstChild();
		while (node != null) {
			if (node.getNodeName() != null && node.getNodeName().contentEquals(name)) {
				NamedNodeMap nnm = node.getAttributes();
				Node item = nnm.getNamedItem(attr);
				if (item.getNodeValue() != null && item.getNodeValue().startsWith(value)) {
					return node;
				}
			}
			node = node.getNextSibling();
		}
		return null;
	}

	public static Node getFirstChildByNameWithTextContains(Node parent, String name, String contains) {
		Node node = parent.getFirstChild();
		while (node != null) {
			if (node.getNodeName() != null && node.getNodeName().contentEquals(name)) {
				String text = node.getTextContent();
				if (text.contains(contains))
					return node;
			}
			node = node.getNextSibling();
		}
		return null;
	}

	public static Node newNode(Document doc, String name) {
		Element udn = doc.createElement(name);
		return udn;
	}

	public static Node newNodeWithAttr(Document doc, String name, String attr, String value) {
		Element udn = doc.createElement(name);
		udn.setAttribute(attr, value);
		return udn;
	}

	public static void printChildren(Node node) {
		if (node.hasChildNodes()) {
			NodeList nl = node.getChildNodes();
			for (int index = 0; index < nl.getLength(); ++index) {
				Node child = nl.item(index);
				StringBuilder sb = new StringBuilder("<" + child.getNodeName());
				if (child.hasAttributes()) {
					NamedNodeMap nnm = child.getAttributes();
					for (int index2 = 0; index2 < nnm.getLength(); ++index2) {
						Node attr = nnm.item(index2);
						sb.append(" " + attr.getNodeName() + "=\"" + attr.getTextContent() + "\"");
					}
				}
				sb.append(">");
				System.out.println(sb);
			}
		} else {
			System.out.println("Hat keine Kinder. Text = " + node.getTextContent());
		}
	}

	public static Element newIeDmdElement() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		Element root = doc.createElementNS("http://www.loc.gov/METS/", "mets:mets");
		doc.appendChild(root);
		Element dmdSec = doc.createElement("mets:dmdSec");
		dmdSec.setAttribute("ID", "ie-dmd");
		root.appendChild(dmdSec);
		Element mdWrap = doc.createElement("mets:mdWrap");
		mdWrap.setAttribute("MDTYPE", "DC");
		dmdSec.appendChild(mdWrap);
		Element xmlData = doc.createElement("mets:xmlData");
		mdWrap.appendChild(xmlData);
		Element record = doc.createElementNS("http://purl.org/dc/elements/1.1/", "dc:record");
		record.setAttribute("xmlns:dcterms", "http://purl.org/dc/terms/");
		record.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		xmlData.appendChild(record);
		return record;
	}
}
