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
	 * Teilt der Steuerung den Beginn des Name_eingegeben Ereignisses der Steuerung mit
	 * 
	 * @param mouseListener Übergabe des jeweiligen Maus-Events
	 */
	public void Name_eingegeben(MouseListener mouseListener);
	
	/**
	 * Kommuniziert den Beginn eines neues_Spiel Ergeignisses an die Steuerung
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
	 * Das Bestenliste Objekt verändert in der GUI seine Sichtbarkeit mittels der von JPanel geerbten Methode
	 * 
	 * @param wert True/False für eine sichtbare/unsichtbare Liste
	 */
	public void sichtbar(boolean wert);
}
