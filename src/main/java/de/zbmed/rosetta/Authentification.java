package de.zbmed.rosetta;

import java.util.Base64;

import de.zbmed.utilities.*;

public class Authentification {

	public static String getAuthToken(String rosettaInstance) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append(Custom.getUsername(rosettaInstance));
		sb.append("-institutionCode-");
		sb.append(Custom.getInstitution(rosettaInstance));
		sb.append(":");
		sb.append(Custom.getPassword(rosettaInstance));
		return "Basic ".concat(Base64.getEncoder().encodeToString(sb.toString().getBytes()));
	}
}
