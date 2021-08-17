package de.janreuteringimp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ErgebnislisteTest {
	@Test public void speichereTest() {
		Ergebnisliste ergebnisliste = new Ergebnisliste();
		ergebnisliste.speichere(new Ergebnis("TestSpeicher", 10, 10));
		ergebnisliste.start();
		assertEquals("Speichern von Elementen funktioniert nicht.",ergebnisliste.aktuelles_Ergebnis().getReihenlaenge(),10);
	}
	@Test public void aktuelles_Ergebnis_Test() {
		Ergebnisliste ergebnisliste = new Ergebnisliste();
		Ergebnis ergebnisZumSpeichern = new Ergebnis("TestAktuellesErgebnis",10,10);
		ergebnisliste.speichere(ergebnisZumSpeichern);
		ergebnisliste.start();
		Ergebnis ergebnis = ergebnisliste.aktuelles_Ergebnis();
		assertEquals("Aktuelles Ergebnis funktioniert nicht.",ergebnis.getReihenlaenge(),ergebnisZumSpeichern.getReihenlaenge());
		
		
	}
	@Test public void startTest() {
		Ergebnisliste ergebnisliste = new Ergebnisliste();
		ergebnisliste.speichere(new Ergebnis("TestSpeicher",20,20));
		ergebnisliste.speichere(new Ergebnis("TestSpeicher",10,10));
		ergebnisliste.start();
		assertEquals("Setzen auf Erstes Element funktioniert nicht.",ergebnisliste.aktuelles_Ergebnis().getReihenlaenge(),20);
	}
	@Test public void weiterTest() {
		Ergebnisliste ergebnisliste = new Ergebnisliste();
		ergebnisliste.speichere(new Ergebnis("TestSpeicher",20,20));
		ergebnisliste.speichere(new Ergebnis("TestSpeicher",10,10));
		ergebnisliste.start();
		ergebnisliste.weiter();
		assertEquals("Zeigen auf naechstes Element funktioniert nicht.",ergebnisliste.aktuelles_Ergebnis().getReihenlaenge(),10);
	}
}
