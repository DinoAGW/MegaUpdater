package de.zbmed.utilities;

public class Utilities {

	public static void printDiff(String vorher, String nachher) {
		int anf = -1;
		for (int i = 0; i < vorher.length() && i < nachher.length(); ++i) {
			if (vorher.charAt(i) != nachher.charAt(i)) {
				anf = i;
				break;
			}
		}
		if (anf == -1) {
			System.out.println("Unverändert");
			return;
		}
		int end = -1;
		for (int i = 0; i < vorher.length() && i < nachher.length(); ++i) {
			if (vorher.charAt(vorher.length() - i - 1) != nachher.charAt(nachher.length() - i - 1)) {
				end = i + 1;
				break;
			}
		}
		int umgebung = 0;// 5
		if (umgebung > anf)
			umgebung = anf;
		if (umgebung > end)
			umgebung = end;
		System.out.println("==========================  vorher ===========================");
		if (anf + end <= vorher.length()) {
			System.out.println(vorher.substring(anf - umgebung, vorher.length() - end + 1 + umgebung));
		} else {
			System.out.println("Hier nichts Neues");
		}
		System.out.println("========================== nachher ===========================");
		if (anf + end <= nachher.length()) {
			System.out.println(nachher.substring(anf - umgebung, nachher.length() - end + 1 + umgebung));
		} else {
			System.out.println("Hier nichts Neues");
		}
	}

	public static void main(String[] args) {

	}

}
