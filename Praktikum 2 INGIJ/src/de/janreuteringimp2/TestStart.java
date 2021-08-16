package de.janreuteringimp2;

public class TestStart {
	public static void main(String []arhs) {
		System.out.println("Test");
		Caesar caesarTest = new Caesar();
		caesarTest.Schluessel(12);
		caesarTest.verschluesseln("TÜest");
		String verschluesselterText = caesarTest.getVerschluesselterText();
		caesarTest.entschluesseln(verschluesselterText);
		System.out.println(caesarTest.getUnverschluesselterText());
	}
}
