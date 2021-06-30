/**
 * Class representing the result of a game
 * @author jan.reuter
 *
 */
public interface Ergebnis extends Comparable{
	/*
	 * Konstruktor
	 * @param String name
	 * @param int spielzeitInSekunden
	 * @param int reihenlaenge
	 * 
	 * public Ergebnis(String name, int spielzeitInSekunden, int reihenlaenge); 
	/**
	 * Vertgleiche das aktuelle Ergebnis mit einem übergebenen Ergebnis Objekt e, dann wird ein Integer mit dem Ergebnis zurückgegeben (0 kleiner, 1 groesser, 2 gleich)
	 * @param e
	 * @return compareWertAlsInt
	 */
	public int CompareTo(Ergebnis e);
}
