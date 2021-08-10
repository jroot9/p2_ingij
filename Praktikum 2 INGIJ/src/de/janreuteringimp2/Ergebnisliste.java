package de.janreuteringimp2;
/**
 * Class to save a unknown amount of Ergebnis objects
 * @author jan.reuter
 *
 */
public interface Ergebnisliste {
	/**
	 * Speichere ein neues Ergebnis in die Ergebnisliste
	 * @param ergebnis
	 */
	public void speichere(Ergebnis ergebnis);
	/**
	 * Zeige auf das erste Element der Ergebnisliste
	 */
	public void start();
	/**
	 * Zeige auf das naechste Element in der Ergebnisliste
	 */
	public void weiter();
	/**
	 * Gebe aus ob das letzte Element der Ergebnisliste erreicht ist
	 * @return boolean
	 */
	public boolean ende();
	/**
	 * Gebe das aktuelle Element der Ergebnisliste zurück
	 * @return ergebnis
	 */
	public Ergebnis aktuelles_Element();
}
