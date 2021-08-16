package de.janreuteringimp2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ErgebnisTest {
	@Test public void ErgebnisCompareTest() {
		Ergebnis ergebnis = new Ergebnis("TestName",0,5);
		Ergebnis ergebnisGroesser = new Ergebnis("ErgebnisGroesser",10,10);
		Ergebnis ergebnisKleiner = new Ergebnis("ErgebnisKleiner",0,1);
		Ergebnis ergebnisGleich = new Ergebnis("ErgebnisGleich",0,5);
		int sollErgebnis = -1;
		int istErgebnis = ergebnis.compareTo(ergebnisKleiner);
		assertEquals("Ergebnis ist nicht kleiner.",sollErgebnis,istErgebnis);
		sollErgebnis = 0;
		istErgebnis = ergebnis.compareTo(ergebnisGleich);
		assertEquals("Ergebnisse sind nicht gleich.",sollErgebnis,istErgebnis);
		sollErgebnis = 1;
		istErgebnis = ergebnis.compareTo(ergebnisGroesser);
		assertEquals("Ergebnis ist nicht größer.", sollErgebnis, istErgebnis);
	}
}
