package de.zbmed;

import java.io.File;

import org.w3c.dom.Node;

import de.zbmed.utilities.Custom;

public class MegaUpdater {
	static final String fs = System.getProperty("file.separator");

	private static File getIngestDatei(File contentFolder) throws Exception {
		File xmlFile = null;
		File csvFile = null;
		for (File file : contentFolder.listFiles()) {
			if (file.getName().endsWith(".xml")) {
				if (xmlFile == null) {
					if (csvFile != null)
						throw new Error("SIP darf nur entweder eine XML-Datei oder eine CSV-Datei haben: "
								+ contentFolder.getPath());
					xmlFile = file;
				} else {
					throw new Exception("SIP darf nur eine XML-Datei unter content haben: " + contentFolder.getPath());
				}
			}
			if (file.getName().endsWith(".csv")) {
				if (csvFile == null) {
					if (xmlFile != null)
						throw new Error("SIP darf nur entweder eine XML-Datei oder eine CSV-Datei haben: "
								+ contentFolder.getPath());
					csvFile = file;
				} else {
					throw new Exception("SIP darf nur eine CSV-Datei unter content haben: " + contentFolder.getPath());
				}
			}
		}
		if (xmlFile != null)
			return xmlFile;
		if (csvFile != null)
			return csvFile;
		throw new Exception("Eine SIP sollte eine XML-Datei oder eine CSV-Datei haben: " + contentFolder.getPath());
	}

	public static void bearbeite(String workflow) throws Exception {
		String rosettaInstance = Custom.rosettaInstance(workflow);
		String updateSipFolderPath = Custom.updateSipFolder(workflow);
		System.out.println(
				"MegaUpdater: Bearbeite Workflow " + workflow + " (" + rosettaInstance + ") -> " + updateSipFolderPath);
		File updateSipFolder = new File(updateSipFolderPath);
		if (!updateSipFolder.exists())
			throw new Exception(updateSipFolderPath + " existiert nicht");
		for (File updateSip : updateSipFolder.listFiles()) {
			if (!updateSip.isDirectory())
				continue;
			File doneFile = new File(updateSip.getPath().concat(fs).concat("done"));
			if (doneFile.exists())
				continue;
			System.out.println("Nun: " + updateSip.getPath());
			File contentFolder = new File(updateSip.getPath().concat(fs).concat("content"));
			if (!contentFolder.exists()) {
				throw new Exception("Eine SIP sollte einen content-Folder haben: " + updateSip.getPath());
			}
			File ingestDatei = getIngestDatei(contentFolder);
			SIP sip = null;
			if (ingestDatei.getName().endsWith(".xml")) {
				sip = new METS(rosettaInstance, ingestDatei);
			}
			if (ingestDatei.getName().endsWith(".csv")) {
//				sip = new CSV(rosettaInstance, ingestDatei);
			}
			if (sip == null) {
				throw new Exception("Sollte eigentlich unmöglich sein");
			}
			Node md = sip.getIeMetadata();
		}
		System.out.println("Bearbeitung Ende");
	}

	public static void main(String[] args) throws Exception {
		bearbeite("Test");
	}
}
