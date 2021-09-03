package de.janreuteringimp2;

import java.util.ArrayList;

public class DatenspeicherTestImplementierung {
	/**
	 * Methode welche eine existierende Liste von Ergebnissen laed
	 * @return ergebnisliste
	 */
	public Liste lade() {
		Liste testListe = new VerketteteListe();
		testListe.setze_an_Anfang(new Ergebnis("Name",2,2));
		testListe.setze_an_Anfang(new Ergebnis("Name",3,3));
		return testListe;
	}
	/**
	 * Methode welche eine uebergebene Ergebnisliste in abspeichert
	 * @param ergebnisliste
	 */
	public void speichere(Liste liste) {
		
	}
}
