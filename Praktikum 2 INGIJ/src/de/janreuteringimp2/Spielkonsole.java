package de.janreuteringimp2;
/**
 * 
 * @author jules.kornas
 * Die Klasse Spielkonsole steuert die Ein- und Ausgabe im Frontend/der Konsole
 */
public interface Spielkonsole {
	/**
	 * gibt an, ob Wert sichtbar ist
	 * @param wert
	 */
	public void sichtbar(boolean wert);
	/**
	 * gibt die Ziffernfolge aus
	 */
	public void starte_Praesentation_Ziffernfolge();
	/**
	 * startet neue Ziffernfolge
	 */
	public void beginne_neue_Ziffernfolge();
	/**
	 * zeigt die eingegebene Ziffer an
	 * @param ziffer
	 */
	public void Ziffer_ausgewaehlt(int s);
	/**
	 * überprüft, ob die eingegebene Ziffer mit der der Ziffernfolge übereinstimmt
	 * @param ziffer
	 * @return boolean
	 */
	public boolean ausgewaehlte_Ziffer_korrekt(int s);
	/**
	 * überprüft, ob alle eingegebenen Ziffern korrekt sind
	 * @return boolean
	 */
	public boolean alle_Ziffern_Memoriert();
	/**
	 * übergibt die Spielzeit in Sekunden
	 * @return int
	 */
	public int Spielzeit();
	/** 
	 * übergibt die Laenge der korrekt eingegebenen Ziffernfolge
	 * @return int
	 */
	public int Laenge_Ziffernfolge();

}


