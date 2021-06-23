/**
 * 
 * @author jan.reuter
 *
 */
public interface Ergebnisliste {
	/**
	 * 
	 * @param ergebnis
	 */
	public void speichere(Ergebnis ergebnis);
	/**
	 * 
	 */
	public void start();
	public void weiter();
	public boolean ende();
	public Ergebnis aktuelles_Element();
}
