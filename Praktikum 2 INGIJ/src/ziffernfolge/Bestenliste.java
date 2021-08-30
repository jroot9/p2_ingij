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
	Ergebnis ergebnis = new Ergebnis("Lena",4,490);
	private int maxZeilen=10;
	private int counterSpiele=0;
	private static final int zeilenabstand=2;
	private static final int ueberschrift = 20;
	public int hoehe=ueberschrift+zeilenabstand*maxZeilen+BestenlisteZeile.groesse*maxZeilen+1;
	public static final int breite=170;
	public static final Benutzeroberflaeche frame = new Benutzeroberflaeche();
	
	
	
	private BestenlisteZeile[] bestenlisteZeile=new BestenlisteZeile[maxZeilen];
	
	public Bestenliste() {
		//this.setBorder(new LineBorder(new Color(0, 0, 0)));
	    this.setSize(breite, hoehe); 
	    this.setLayout(null);
	    this.setVisible(false);
	    
	    Benutzeroberflaeche.btnNeuesSpiel.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		neues_Spiel(e);
	    	}
	    });
	    
	    Benutzeroberflaeche.btnNamenEingeben.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		Name_eingegeben(e);
	    		
	    		//zu Lösen: Spiel starten funktioniert nur nach klicken ins Ziffernfeld
	    		
	    		frame.steuerung.spiel_gestartet();
	    	}
	    });
 
	}
	
	/**
	 * Teilt der Steuerung den Beginn des Name_eingegeben Ereignisses der Steuerung mit
	 * 
	 * @param mouseListener Übergabe des jeweiligen Maus-Events
	 */
	public void Name_eingegeben(MouseEvent e) {
		name=Benutzeroberflaeche.txtNameInput.getText();
		Benutzeroberflaeche.txtNameInput.setText("");
		Benutzeroberflaeche.txtNameInput.setEditable(false);
		Benutzeroberflaeche.txtNameInput.setVisible(false);
		
		
		//button Namen Bestätigen ausblenden + deaktivieren
		Benutzeroberflaeche.btnNamenEingeben.setVisible(false);
		Benutzeroberflaeche.btnNamenEingeben.setEnabled(false);
		
		//Zum Testen der Bestenliste
		neues_Ergebnis(15, 26);
		zeige_Liste_an();
		
		
		
		counterSpiele++;
		Benutzeroberflaeche.btnNeuesSpiel.setVisible(true);
		Benutzeroberflaeche.btnNeuesSpiel.setEnabled(true);
		
		//Komprimierungstest
//		System.out.println("Test der Komprimierung");
//		Komprimierung komprimierung =new Komprimierung();
//		String s = komprimierung.komprimieren("aaaaabb");
//		System.out.println(s);
//	    s=komprimierung.expandieren("a7b");
//		System.out.println(s);
		
	}
	
	/**
	 * Kommuniziert den Beginn eines neues_Spiel Ergeignisses an die Steuerung
	 * 
	 * @param mouseListener Übergabe des jeweiligen Maus-Events
	 */
	public void neues_Spiel(MouseEvent mouseListener){
		
		this.setVisible(false);
		Benutzeroberflaeche.btnNeuesSpiel.setVisible(false);
		Benutzeroberflaeche.btnNeuesSpiel.setEnabled(false);
		this.aktiviere_Namenseingabe();	
		
	}
	
	/**
	 * Erstellt ein neues Ergebnis mit folgenlänge und spielzeit des letzten Spiels.
	 * 
	 * @param folgenlaenge 
	 * @param spielzeit
	 */
	public void neues_Ergebnis(int folgenlaenge, int spielzeit){
		
	//name, folgenlänge, Spielzeit abspeichern + anzahl Spiele erhöhen
	ergebnis.setName(name);
	ergebnis.setReihenlaenge(folgenlaenge);
	ergebnis.setSpielzeitInSekunden(spielzeit);
	
	bestenlisteZeile[counterSpiele]=new BestenlisteZeile(this);
	int ypos=ueberschrift+zeilenabstand+counterSpiele*(zeilenabstand+BestenlisteZeile.groesse);
	bestenlisteZeile[counterSpiele].setLocation(0,ypos);
	this.add(bestenlisteZeile[counterSpiele]);
	
	}
	
	/**
	 * Öffnet die Texteingabe zum eintragen des Spielernames.
	 * 
	 */
	public void aktiviere_Namenseingabe(){
		
		Benutzeroberflaeche.btnNamenEingeben.setVisible(true);
		Benutzeroberflaeche.btnNamenEingeben.setEnabled(true);
		Benutzeroberflaeche.txtNameInput.setEditable(true);
		Benutzeroberflaeche.txtNameInput.setVisible(true);
	}
	
	/**
	 * Gibt die Bestenliste der Letzten Spiele aus. 
	 * 
	 */
	public void zeige_Liste_an(){
		bestenlisteZeile[counterSpiele].zeige_an(ergebnis);
		this.setVisible(true);
		
	}
	
	/**
	 * Das Bestenliste Objekt verändert in der GUI seine Sichtbarkeit mittels der von JPanel geerbten Methode
	 * 
	 * @param wert True/False für eine sichtbare/unsichtbare Liste
	 */
	public void sichtbar(boolean wert){
		this.setVisible(wert);
	}
	
	
}

