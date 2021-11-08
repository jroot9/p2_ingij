package ziffernfolge;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
/**
 * 
 * @author daniel.bierbrauer
 *
 *BestenlisteZeile stellt aus einem Ergebnis eine Zeile der Bestenliste bereit
 *
 */
@SuppressWarnings("serial")
public class BestenlisteZeile extends JPanel 
{
	JLabel jLabel_name = new JLabel();
	JLabel jLabel_folgenlaenge = new JLabel();
	JLabel jLabel_zeit = new JLabel();
	public static final int groesse=18;
	//private Bestenliste bestenliste;
	
	public BestenlisteZeile(Bestenliste bestenliste) {
	    //this.setFont(new Font("Arial", Font.PLAIN, 12));
	    this.setSize(200,groesse);
	    this.setVisible(false);
	    
	    jLabel_name.setFont(new Font("Arial", Font.PLAIN, 12));
	    jLabel_folgenlaenge.setFont(new Font("Arial", Font.PLAIN, 12));
	    jLabel_zeit.setFont(new Font("Arial", Font.PLAIN, 12));
	    setLayout(new GridLayout(0, 3, 0, 0));
	    
	    
	    this.add(jLabel_name);
	    this.add(jLabel_folgenlaenge);
	    this.add(jLabel_zeit);
	   
	 
		
	}
	/**
	 * Zeigt eine Zeile der Bestenliste (Spielergebnis) an.
	 * 
	 * @param ergebnis Ergebniswerte des Spieldurchgangs
	 */
	public void zeige_an(Ergebnis ergebnis) {
		//String ergebnisToString=" "+ergebnis.name+"    "+ergebnis.reihenlaenge+"er Reihe    "+ergebnis.spielzeitInSekunden+"sec";
		jLabel_name.setText(ergebnis.name);
		jLabel_folgenlaenge.setText(ergebnis.reihenlaenge+"er Reihe");
		jLabel_zeit.setText("  "+ergebnis.spielzeitInSekunden+" s.");
		this.setVisible(true);
	}
}