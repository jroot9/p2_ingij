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
	 * Vergleiche das aktuelle Ergebnis mit einem übergebenen Ergebnis Objekt e, dann wird ein Integer mit dem Ergebnis zurückgegeben (<0 kleiner, >0 groesser, 0 gleich)
	 * @param e
	 * @return compareWertAlsInt
	 */
	public int CompareTo(Ergebnis e);
	/**
	 * Gibt den Namen als String des Ergebnis Objektes zurueck
	 * @return name
	 */
	public String getName();
	/**
	 * Gibt die Spielzeit in int vom Ergebnis Objekt zurueck
	 * @return spielzeitInSekunde
	 */
	public int getSpielzeitInSekunde();
	/**
	 * Gibt die Reihenlaenge des Ergebnis Objektes als Integer zurueck
	 * @return reihenlaenge
	 */
	public int	getReihenlaenge();
}
