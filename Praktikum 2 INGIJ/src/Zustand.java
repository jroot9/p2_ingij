/**
 * 
 * @author jules.kornas
 *
 */
public interface Zustand {
	/**
	 * startet das Spiel
	 */
	public void Spiel_gestartet();
	/**
	 * beendet die Praesentation der Ziffernfolge
	 */
	public void Praesentation_Ziffernfolge_beendet();
	/**
	 * zeigt die aktuell ausgewählte Ziffer an
	 * @param ziffer
	 */
	public void Ziffer_ausgewaehlt(Ziffer ziffer);
	/**
	 * startet ein neues Spiel
	 */
	public void neues_Spiel();
	/**
	 * erzeugt die Namenseingabe
	 */
	public void Name_eingegeben();
	/**
	 * Eintritt in einen Zustand 
	 */
	public void entry();
	/**
	 * Ausgang eines Zustandes
	 */
	public void exit();
}
