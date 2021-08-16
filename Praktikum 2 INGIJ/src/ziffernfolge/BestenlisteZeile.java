package ziffernfolge;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
/**
 * 
 * @author daniel.bierbrauer
 *
 *BestenlisteZeile stellt aus einem Ergebnis eine Zeile der Bestenliste bereit
 *
 */
@SuppressWarnings("serial")
public class BestenlisteZeile extends JLabel 
{
	public static final int groesse=12;
	//private Bestenliste bestenliste;
	
	public BestenlisteZeile(Bestenliste bestenliste) {
	    this.setFont(new Font("Arial", Font.PLAIN, 12));
	    this.setSize(170,groesse);
	    this.setVisible(false);
	    
	    /*JLabel jLabel = new JLabel(Ergebnis);
	    jLabel.setFont(new Font("Verdana",1,20));
	    jLabel.setBounds(0,0,200,50);
	    this.add(jLabel);*/
	 
		
	}
	/**
	 * Zeigt eine Zeile der Bestenliste (Spielergebnis) an.
	 * 
	 * @param ergebnis Ergebniswerte des Spieldurchgangs
	 */
	public void zeige_an(Ergebnis ergebnis) {
		String ergebnisToString=" "+ergebnis.getName()+"    "+ergebnis.getReihenlaenge()+"er Reihe    "+ergebnis.getSpielzeitInSekunden()+"sec";
		this.setText(ergebnisToString);
		this.setVisible(true);
	}
}