package de.janreuteringimp2;
/**
 * Class representing the result of a game
 * @author jan.reuter
 *
 */
public class Ergebnis implements Comparable {
	public String name;
	public int spielzeitInSekunden;
	public int reihenlaenge;
	/*
	 * Konstruktor
	 * @param String name
	 * @param int spielzeitInSekunden
	 * @param int reihenlaenge
	 */
	public Ergebnis(String name, int spielzeitInSekunden, int reihenlaenge) {
		this.name = name;
		this.spielzeitInSekunden = spielzeitInSekunden;
		this.reihenlaenge = reihenlaenge;
	}
	/**
	 * Vergleiche das aktuelle Ergebnis Objekt mit einem Uebergebenen Ergebnis e, dann wird ein Integer zurueckgegeben (<0 kleiner als, >0 groesser als, 0 gleich als)
	 * @param e
	 * @return compareWertAlsInt
	 */
	@Override
	public int compareTo(Object o) {
		Ergebnis ergebnisToCompare = (Ergebnis)o;
		if(ergebnisToCompare.reihenlaenge > this.reihenlaenge) {
			return 1;
		} else if(ergebnisToCompare.reihenlaenge == this.reihenlaenge) {
			return 0;
		}
		return -1;
	}
}
