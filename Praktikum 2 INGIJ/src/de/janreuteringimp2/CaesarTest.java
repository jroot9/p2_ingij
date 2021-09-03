package de.janreuteringimp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaesarTest {
	private Caesar caesarObjekt = new Caesar();
	@Test public void verschluesselnTest() {
		caesarObjekt.Schluessel("8");
		caesarObjekt.verschluesseln(new StringBuffer().append("Test"));
		assertEquals("Verschlüsselung funktioniert nicht",caesarObjekt.getVerschluesselterText(),"Bmab");
	}
	@Test public void entschluesselnTest() {
		caesarObjekt.Schluessel("12");
		caesarObjekt.entschluesseln(new StringBuffer().append("Tmxxa"));
		assertEquals("Entschlüsselung funktioniert nicht", caesarObjekt.getUnverschluesselterText(),"Hallo");
	}

	@Test public void verschluesselnMitUmlautTest() {
		caesarObjekt.Schluessel("25");
		caesarObjekt.verschluesseln(new StringBuffer().append("üÄÖß-_:;Üäö)(//!\"§$%&/()=?`´²³4{[]}"));
		assertEquals("Umlaute werden nicht in das ASCII Format gebracht.","tdZdNdrrTdzdnd",caesarObjekt.getVerschluesselterText());
	}
	@Test public void verschluesseln1Test() {
		caesarObjekt.Schluessel("8888888888");
		caesarObjekt.verschluesseln(new StringBuffer().append("Bmab"));
		assertEquals("Verschlüsselung funktioniert nicht",caesarObjekt.getVerschluesselterText(),"Bmab");
	}
		@Test public void verschluesseln2Test() {
		caesarObjekt.Schluessel("geheimerSchlüssel");
		caesarObjekt.verschluesseln(new StringBuffer().append("Bmab"));
		assertEquals("Verschlüsselung funktioniert nicht",caesarObjekt.getVerschluesselterText(),"Bmab");
	}
}
