package de.janreuteringimp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaesarTest {
	private Caesar caesarObjekt = new Caesar();
	@Test public void verschluesselnTest() {
		caesarObjekt.Schluessel(8);
		caesarObjekt.verschluesseln("Test");
		assertEquals("Verschl�sselung funktioniert nicht",caesarObjekt.getVerschluesselterText(),"Bmab");
	}
	@Test public void entschluesselnTest() {
		caesarObjekt.Schluessel(12);
		caesarObjekt.entschluesseln("Tmxxa");
		assertEquals("Entschl�sselung funktioniert nicht", caesarObjekt.getUnverschluesselterText(),"Hallo");
	}
	@Test public void verschluesselnMitUmlautTest() {
		caesarObjekt.Schluessel(25);
		caesarObjekt.verschluesseln("����");
		assertEquals("Umlaute werden nicht in das ASCII Format gebracht.",caesarObjekt.getVerschluesselterText(),"tdZdNdrr");
	}
}
