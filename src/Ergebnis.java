/**
 * Class representing the result of a game
 * @author jan.reuter
 *
 */
public interface Ergebnis {
	/*
	 * Konstruktor
	 * @param String name
	 * @param int spielzeitInSekunden
	 * @param int reihenlaenge
	 * 
	 * public Ergebnis(String name, int spielzeitInSekunden, int reihenlaenge); 
	/**
	 * Vergleiche das aktuelle Ergebnis Objekt mit einem übergebenen Ergebnis e, dann wird ein Integer zurückgegeben (<0 kleiner als, >0 groesser als, 0 gleich als)
	 * @param e
	 * @return compareWertAlsInt
	 */
	public int compareTo(Object e);
	/**
	 * Gibt den Namen als String dieses Ergebnis Objekt zurueck
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
