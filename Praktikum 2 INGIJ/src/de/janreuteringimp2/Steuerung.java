package de.janreuteringimp2;
/**
 * 
 * @author jules.kornas
 * Die Klasse Steuerung steuert die Spielabfolge
 */
public interface Steuerung {
	/**
	 * startet das Spiel
	 */
	public void Spiel_gestartet();
	/**
	 * beendet die Anzeige der Ziffernfolge
	 */
	public void Praesentation_Ziffernfolge_beendet();
	/**
	 * zeigt die aktuell ausgewählte Ziffer an
	 * @param ziffer
	 */
	public void Ziffer_ausgewaehlt(int s);
	/**
	 * startet ein neues Spiel
	 */
	public void neues_Spiel();
	/**
	 * ermöglicht die Nameneingabe
	 */
	public void Name_eingegeben();

}

