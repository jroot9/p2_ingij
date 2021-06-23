/**
 * Klasse welche die Speicherung der aus Ergebnisliste übergebenenspieldaten
 * bereitstellt.
 * 
 * @author jan.reuter
 *
 */
public interface Datenspeicher {
	/**
	 * Methode welche eine existierende Liste von Ergebnissen laed
	 * @return ergebnisliste
	 */
	public Ergebnisliste lade();
	/**
	 * Methode welche eine uebergebene Ergebnisliste in abspeichert
	 * @param ergebnisliste
	 */
	public void speichere(Ergebnisliste ergebnisliste);
}
