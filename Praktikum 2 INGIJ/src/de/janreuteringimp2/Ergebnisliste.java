package de.janreuteringimp2;

import java.awt.List;

import de.janreuteringimp2.Liste.Iterator;

/**
 * Class to save a unknown amount of Ergebnis objects
 * @author jan.reuter
 *
 */
public class Ergebnisliste  {
	private Iterator iterator;
	private Liste ergebnisliste;
	private Sortierung sortierung;
	private DatenspeicherTestImplementierung datenspeicher = new DatenspeicherTestImplementierung();
	public Ergebnisliste() {
		ergebnisliste = datenspeicher.lade();
		iterator = ergebnisliste.erzeuge_Iterator();
		sortierung = new Auswahlsortierung();
	}
	/**
	 * Speichere ein neues Ergebnis in die Ergebnisliste
	 * @param ergebnis
	 */
	public void speichere(Ergebnis ergebnis) {
		ergebnisliste.fuege_ein_vor(ergebnis, iterator);
	
	}
	/**
	 * Zeige auf das erste Element der Ergebnisliste
	 */
	public void start() {
		iterator = ergebnisliste.erzeuge_Iterator();
	}
	/**
	 * Zeige auf das naechste Element in der Ergebnisliste
	 */
	public void weiter() {
		iterator.weiter();
	}
	/**
	 * Gebe aus ob das letzte Element der Ergebnisliste erreicht ist
	 * @return boolean
	 */
	public boolean ende() {
		if(iterator.nach_ende()) return true;
		return false;
	}
	/**
	 * Gebe das aktuelle Element der Ergebnisliste zurück
	 * @return ergebnis
	 */
	public Ergebnis aktuelles_Ergebnis() {
			return (Ergebnis)iterator.element();
	}
}
