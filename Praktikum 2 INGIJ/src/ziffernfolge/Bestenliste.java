package ziffernfolge;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;



/**
 * 
 * @author daniel.bierbrauer
 * 
 * Die Klasse Bestenliste erstellt aus den Ergebnissen der letzten Runden eine Bestenliste
 *
 */
@SuppressWarnings("serial")
public class Bestenliste  extends JPanel
{
	private static String name;
	Ergebnis ergebnis = new Ergebnis("NULL",0,0);
	private int maxZeilen=2;
	private int counterSpiele=0;
	private static final int zeilenabstand=2;
	private static final int ueberschrift = 20;
	public int hoehe=ueberschrift+zeilenabstand*maxZeilen+BestenlisteZeile.groesse*maxZeilen+1;
	public static final int breite=170;
	private Benutzeroberflaeche bof;
	private Ergebnisliste ergebnisliste = new Ergebnisliste();
	
	
	
	private BestenlisteZeile[] bestenlisteZeile=new BestenlisteZeile[maxZeilen+1];
	
	public Bestenliste(Benutzeroberflaeche bof) {
		this.bof = bof;
	    this.setSize(breite, hoehe); 
	    this.setLayout(null);
	    this.sichtbar(false);
 
	}
	
	/**
	 * Teilt der Steuerung den Beginn des Name_eingegeben Ereignisses der Steuerung mit
	 * 
	 * @param mouseListener �bergabe des jeweiligen Maus-Events
	 */
	public void Name_eingegeben(MouseEvent e) {
		name=bof.txtNameInput.getText();
		bof.txtNameInput.setText("");
		bof.txtNameInput.setEditable(false);
		bof.txtNameInput.setVisible(false);
		
		
		//button Namen Best�tigen ausblenden + deaktivieren
		bof.btnNamenEingeben.setVisible(false);
		bof.btnNamenEingeben.setEnabled(false);
		
		
		counterSpiele++;
		bof.btnNeuesSpiel.setVisible(true);
		bof.btnNeuesSpiel.setEnabled(true);
		
		
	}
	
	/**
	 * Kommuniziert den Beginn eines neues_Spiel Ergeignisses an die Steuerung
	 * 
	 * @param mouseListener �bergabe des jeweiligen Maus-Events
	 */
	public void neues_Spiel(MouseEvent mouseListener){
		
		this.sichtbar(false);
		bof.btnNeuesSpiel.setVisible(false);
		bof.btnNeuesSpiel.setEnabled(false);
		this.aktiviere_Namenseingabe();	
		
	}
	
	/**
	 * Erstellt ein neues Ergebnis mit folgenl�nge und spielzeit des letzten Spiels.
	 * 
	 * @param folgenlaenge 
	 * @param spielzeit
	 */
	public void neues_Ergebnis(int folgenlaenge, int spielzeit){
		
	//name, folgenl�nge, Spielzeit abspeichern
	ergebnis.name = name;
	ergebnis.reihenlaenge = folgenlaenge;
	ergebnis.spielzeitInSekunden = spielzeit;
	 
	ergebnisliste.fuege_ein_nach(ergebnis);
	if(counterSpiele<=maxZeilen) {
		bestenlisteZeile[counterSpiele]=new BestenlisteZeile(this);
		int ypos=ueberschrift+zeilenabstand+counterSpiele*(zeilenabstand+BestenlisteZeile.groesse);
		bestenlisteZeile[counterSpiele].setLocation(0,ypos);
		this.add(bestenlisteZeile[counterSpiele]);
		
	}
	
	
	}
	
	/**
	 * �ffnet die Texteingabe zum eintragen des Spielernames.
	 * 
	 */
	public void aktiviere_Namenseingabe(){
		
		bof.btnNamenEingeben.setVisible(true);
		bof.btnNamenEingeben.setEnabled(true);
		bof.txtNameInput.setEditable(true);
		bof.txtNameInput.setVisible(true);
	}
	
	/**
	 * Gibt die Bestenliste der Letzten Spiele aus. 
	 * 
	 */
	public void zeige_Liste_an(){
		if(counterSpiele<=maxZeilen) {
		bestenlisteZeile[counterSpiele].zeige_an(ergebnis);
		}else bestenlisteZeile[maxZeilen].zeige_an(ergebnis);
		this.sichtbar(true);
		
	}
	
	/**
	 * Das Bestenliste Objekt ver�ndert in der GUI seine Sichtbarkeit mittels der von JPanel geerbten Methode
	 * 
	 * @param wert True/False f�r eine sichtbare/unsichtbare Liste
	 */
	public void sichtbar(boolean wert){
		this.setVisible(wert);
	}
	
	
}

