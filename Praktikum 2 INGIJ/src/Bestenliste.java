import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * 
 * @author daniel.bierbrauer
 * 
 * Die Klasse Bestenliste erstellt aus den Ergebnissen der letzten Runden eine Bestenliste
 *
 */
public interface Bestenliste // extends JPanel
{
	/**
	 * Best�tigt per Mausklick die Eingabe des Spielernames .
	 * 
	 * @param mouseListener �bergabe des jeweiligen Maus-Events
	 */
	public void Name_eingegeben(MouseListener mouseListener);
	
	/**
	 * Der Start eines neuen Spiels wird per Mausklick eingeleitet.
	 * 
	 * @param mouseListener �bergabe des jeweiligen Maus-Events
	 */
	public void neues_Spiel(MouseListener mouseListener);
	
	/**
	 * Erstellt ein neues Ergebnis mit folgenl�nge und spielzeit des letzten Spiels.
	 * 
	 * @param folgenlaenge 
	 * @param spielzeit
	 */
	public void neues_Ergebnis(int folgenlaenge, int spielzeit);
	
	/**
	 * �ffnet die Texteingabe zum eintragen des Spielernames.
	 * 
	 */
	public void aktiviere_Namenseingabe();
	
	/**
	 * Gibt die Bestenliste der Letzten Spiele aus. 
	 * 
	 */
	public void zeige_Liste_an();
	
	/**
	 * Sorgt mit �bergebenem boolean wert f�r die Sichtbarkeit der Liste.
	 * 
	 * @param wert True/False f�r eine sichtbare/unsichtbare Liste
	 */
	public void sichtbar(boolean wert);
}
