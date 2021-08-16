package de.janreuteringimp2;
/**
 * Class representing the result of a game
 * @author jan.reuter
 *
 */
public class Ergebnis implements Comparable {
	private String name;
	private int spielzeitInSekunden;
	private int reihenlaenge;
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
		if(ergebnisToCompare.getReihenlaenge() > this.getReihenlaenge()) {
			return 1;
		} else if(ergebnisToCompare.getReihenlaenge() == this.getReihenlaenge()) {
			return 0;
		}
		return -1;
	}
	/**
	 * Gibt den Namen als String dieses Ergebnis Objekt zurueck
	 * @return name
	 */
	public String getName() { return name; }
	/**
	 * Gibt die Spielzeit in int vom Ergebnis Objekt zurueck
	 * @return spielzeitInSekunde
	 */
	public int getSpielzeitInSekunde() { return spielzeitInSekunden; }
	/**
	 * Gibt die Reihenlaenge des Ergebnis Objektes als Integer zurueck
	 * @return reihenlaenge
	 */
	public int	getReihenlaenge() { return reihenlaenge; }

}
