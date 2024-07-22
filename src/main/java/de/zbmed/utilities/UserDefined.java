package de.zbmed.utilities;

public class UserDefined {
	static final String fs = System.getProperty("file.separator");

	public static String defaultRosettaURL(String rosettaInstance) throws Exception {
		if (rosettaInstance.equals("dev")) {
			return "https://rosetta.develop.lza.tib.eu";
		} else if (rosettaInstance.equals("test")) {
			return "https://rosetta.test.lza.tib.eu";
		} else if (rosettaInstance.equals("prod")) {
			return "https://rosetta.lza.tib.eu";
		} else {
			System.err.println("invalider Wert für rosettaInstance '" + rosettaInstance + "'.");
			throw new Exception();
		}
	}

	public static String defaultInstitution(String rosettaInstance) throws Exception {
		if (rosettaInstance.equals("dev")) {
			return "ZBM";
		} else if (rosettaInstance.equals("test")) {
			return "ZBMED";
		} else if (rosettaInstance.equals("prod")) {
			return "ZBMED";
		} else {
			System.err.println("invalider Wert für rosettaInstance '" + rosettaInstance + "'.");
			throw new Exception();
		}
	}

	public static String defaultUserName(String rosettaInstance) throws Exception {
		if (rosettaInstance.equals("dev")) {
			return "SubApp ZB MED";
		} else if (rosettaInstance.equals("test")) {
			return "SubApp ZB MED";
		} else if (rosettaInstance.equals("prod")) {
			return "SubApp ZB MED";
		} else {
			System.err.println("invalider Wert für rosettaInstance '" + rosettaInstance + "'.");
			throw new Exception();
		}
	}

	public static String defaultPassword(String rosettaInstance) throws Exception {
		if (rosettaInstance.equals("dev")) {
			String propertyDateiPfad = System.getProperty("user.home").concat(fs).concat("Rosetta_Properties.txt");
			PropertiesManager prop = new PropertiesManager(propertyDateiPfad);
			return prop.readStringFromProperty("SubApp_Passwort");
		} else if (rosettaInstance.equals("test")) {
			String propertyDateiPfad = System.getProperty("user.home").concat(fs).concat("Rosetta_Properties.txt");
			PropertiesManager prop = new PropertiesManager(propertyDateiPfad);
			return prop.readStringFromProperty("SubApp_Passwort");
		} else if (rosettaInstance.equals("prod")) {
			String propertyDateiPfad = System.getProperty("user.home").concat(fs).concat("Rosetta_Properties.txt");
			PropertiesManager prop = new PropertiesManager(propertyDateiPfad);
			return prop.readStringFromProperty("SubApp_Passwort");
		} else {
			System.err.println("invalider Wert für rosettaInstance '" + rosettaInstance + "'.");
			throw new Exception();
		}
	}

	public static String defaultIE_WSDL_URL(String rosettaURL) {
		return rosettaURL.concat("/dpsws/repository/IEWebServices?wsdl");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
