package ziffernfolge;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
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
	Ergebnis ergebnis = new Ergebnis("Lena",4,490);
	private int maxZeilen=10;
	private int counterSpiele=0;
	private static final int Zeilenabstand=5;
	public int hoehe=Zeilenabstand*maxZeilen+BestenlisteZeile.groesse*maxZeilen+1;
	public static final int breite=170;
	
	
	private BestenlisteZeile[] bestenlisteZeile=new BestenlisteZeile[maxZeilen];
	
	public Bestenliste() {
		this.setBorder(new LineBorder(new Color(0, 0, 0)));
	    this.setSize(breite, hoehe); 
	    this.setLayout(null);
	    this.setVisible(false);
	    
	    /*for(int i=0;i<anzahlSpiele;i++)
	    { 
	    	bestenlisteZeile[i]=new BestenlisteZeile(this);
	        int ypos=Zeilenabstand+i*(Zeilenabstand+BestenlisteZeile.groesse);
	        bestenlisteZeile[i].setLocation(0,ypos);
	        this.add(bestenlisteZeile[i]);
	    }*/
	}
	
	/**
	 * Teilt der Steuerung den Beginn des Name_eingegeben Ereignisses der Steuerung mit
	 * 
	 * @param mouseListener �bergabe des jeweiligen Maus-Events
	 */
	public void Name_eingegeben(MouseEvent e) {
		name=Benutzeroberflaeche.txtNameInput.getText();
		Benutzeroberflaeche.txtNameInput.setText("");
		Benutzeroberflaeche.txtNameInput.setEditable(false);
		Benutzeroberflaeche.txtNameInput.setVisible(false);
		
		//Spiel starten funktioniert noch nicht
		//Steuerung zustand = null;
		//zustand.spiel_gestartet();
		
		//button Namen Best�tigen ausblenden + deaktivieren
		Benutzeroberflaeche.btnNamenEingeben.setVisible(false);
		Benutzeroberflaeche.btnNamenEingeben.setEnabled(false);
		
		//Zum Testen
		neues_Ergebnis(15, 26);
		this.setVisible(true);
		bestenlisteZeile[counterSpiele].zeige_an(ergebnis);
		counterSpiele++;
		Benutzeroberflaeche.btnNeuesSpiel.setVisible(true);
		Benutzeroberflaeche.btnNeuesSpiel.setEnabled(true);
	}
	
	/**
	 * Kommuniziert den Beginn eines neues_Spiel Ergeignisses an die Steuerung
	 * 
	 * @param e �bergabe des jeweiligen Maus-Events
	 */
	public void neues_Spiel(MouseEvent e){
		
		this.setVisible(false);
		Benutzeroberflaeche.btnNeuesSpiel.setVisible(false);
		Benutzeroberflaeche.btnNeuesSpiel.setEnabled(false);
		this.aktiviere_Namenseingabe();	
		
	}
	
	/**
	 * Erstellt ein neues Ergebnis mit folgenl�nge und spielzeit des letzten Spiels.
	 * 
	 * @param folgenlaenge 
	 * @param spielzeit
	 */
	public void neues_Ergebnis(int folgenlaenge, int spielzeit){
		
	//name, folgenl�nge, Spielzeit abspeichern + anzahl Spiele erh�hen
	ergebnis.setName(name);
	ergebnis.setReihenlaenge(folgenlaenge);
	ergebnis.setSpielzeitInSekunden(spielzeit);
	
	bestenlisteZeile[counterSpiele]=new BestenlisteZeile(this);
	int ypos=Zeilenabstand+counterSpiele*(Zeilenabstand+BestenlisteZeile.groesse);
	bestenlisteZeile[counterSpiele].setLocation(0,ypos);
	this.add(bestenlisteZeile[counterSpiele]);
	
	}
	
	/**
	 * �ffnet die Texteingabe zum eintragen des Spielernames.
	 * 
	 */
	public void aktiviere_Namenseingabe(){
		
		Benutzeroberflaeche.btnNamenEingeben.setVisible(true);
		Benutzeroberflaeche.btnNamenEingeben.setEnabled(true);
		Benutzeroberflaeche.txtNameInput.setEditable(true);
		Benutzeroberflaeche.txtNameInput.setVisible(true);
		//JOptionPane.showMessageDialog(null, "Bitte Namen angeben und best�tigen!");
	}
	
	/**
	 * Gibt die Bestenliste der Letzten Spiele aus. 
	 * 
	 */
	public void zeige_Liste_an(){
		this.setVisible(true);
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