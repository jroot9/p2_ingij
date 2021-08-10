package de.janreuteringimp2;
/**
 * 
 * @author daniel.bierbrauer
 *
 *BestenlisteZeile stellt aus einem Ergebnis eine Zeile der Bestenliste bereit
 *
 */
public interface BestenlisteZeile //extends JPanel
{
	/**
	 * Zeigt eine Zeile der Bestenliste (Spielergebnis) an.
	 * 
	 * @param ergebnis Ergebniswerte des Spieldurchgangs
	 */
	public void zeige_an(Ergebnis ergebnis);
}
