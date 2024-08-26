package de.zbmed.utilities;

import java.net.URL;

import javax.xml.namespace.QName;

import com.exlibris.dps.IEWebServices;
import com.exlibris.dps.IEWebServices_Service;
import com.exlibris.dps.sdk.pds.HeaderHandlerResolver;

public class WebServices {
	private static IEWebServices ieWs = null;
	private static String rosettaInstanceDesWs = null;

	private static IEWebServices getIEWebServicesPort(String rosettaInstance) throws Exception {
		if (rosettaInstanceDesWs != rosettaInstance) {
			rosettaInstanceDesWs = rosettaInstance;

			final String rosettaURL = Custom.getRosettaURL(rosettaInstance);
			final String institution = Custom.getInstitution(rosettaInstance);
			final String userName = Custom.getUsername(rosettaInstance);
			final String password = Custom.getPassword(rosettaInstance);
			final String IE_WSDL_URL = Custom.getIE_WSDL_URL(rosettaURL);

			IEWebServices_Service ieWS = new IEWebServices_Service(new URL(IE_WSDL_URL),
					new QName("http://dps.exlibris.com/", "IEWebServices"));
			ieWS.setHandlerResolver(new HeaderHandlerResolver(userName, password, institution));

			ieWs = ieWS.getIEWebServicesPort();
		}
		return ieWs;
	}

	public static String getMD(String rosettaInstance, String iePid) throws Exception {
		String retval = null;
		int tried = 0;
		while (retval == null) {
			try {
				retval = getIEWebServicesPort(rosettaInstance).getMD(null, iePid, null, null, null);
			} catch (Exception e) {
				System.err.println("Fehler");
				++tried;
				if (tried == 10)
					throw e;
			}
		}
		return retval;
	}

	public static String getIE(String rosettaInstance, String iePid) throws Exception {
		String retval = null;
		int tried = 0;
		while (retval == null) {
			try {
				retval = getIEWebServicesPort(rosettaInstance).getIE(null, iePid, null);
			} catch (Exception e) {
				System.err.println("Fehler");
				++tried;
				if (tried == 10)
					throw e;
			}
		}
		return retval;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(getMD("IE28266070", "prod"));
		System.out.println(getMD("IE9712123", "prod"));
	}
}
