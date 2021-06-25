import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * 
 * @author daniel.bierbrauer
 *
 */
public interface Bestenliste // extends JPanel
{
	/**
	 * Bestätigt per Mausklick die Eingabe des Spielernames .
	 * 
	 * @param mouseListener Übergabe des jeweiligen Maus-Events
	 */
	public void Name_eingegeben(MouseListener mouseListener);
	
	/**
	 * Der Start eines neuen Spiels wird per Mausklick eingeleitet.
	 * 
	 * @param mouseListener Übergabe des jeweiligen Maus-Events
	 */
	public void neues_Spiel(MouseListener mouseListener);
	
	/**
	 * Erstellt ein neues Ergebnis mit folgenlänge und spielzeit des letzten Spiels.
	 * 
	 * @param folgenlaenge 
	 * @param spielzeit
	 */
	public void neues_Ergebnis(int folgenlaenge, int spielzeit);
	
	/**
	 * Öffnet die Texteingabe zum eintragen des Spielernames.
	 * 
	 */
	public void aktiviere_Namenseingabe();
	
	/**
	 * Gibt die Bestenliste der Letzten Spiele aus. 
	 * 
	 */
	public void zeige_Liste_an();
	
	/**
	 * Sorgt mit übergebenem boolean wert für die Sichtbarkeit der Liste.
	 * 
	 * @param wert True/False für eine sichtbare/unsichtbare Liste
	 */
	public void sichtbar(boolean wert);
}
