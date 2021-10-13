package de.janreuteringimp2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import de.janreuteringimp2.VerketteteListe.Iterator;

/**
 * Klasse welche die Speicherung der aus Ergebnisliste Ã¼bergebenenspieldaten
 * bereitstellt.
 * 
 * @author jan.reuter
 *
 */
public class Datenspeicher {
	private Kryptomethode kryptomethode;
	private Komprimierung komprimiermethode;
	private int caesarSchluessel = 4;
	private String dateiName = "/data/gameData.txt";
	/**
	 * Constructor mit Angabe vom DateiNamen, initialisiert die Verschlüsselung, sowie die Komprimierung
	 * @param dateiName
	 */
	public Datenspeicher(String dateiName) {
		this.dateiName = dateiName;
		this.kryptomethode = new Caesar();
		this.komprimiermethode = new Komprimierung();
	}
	/**
	 * Leerer Constructor, initialisiert die Verschlüsselung, sowie die Komprimierung
	 */
	public Datenspeicher() {
		this.kryptomethode = new Caesar();
		this.komprimiermethode = new Komprimierung();
	}
	/**
	 * Methode welche eine existierende Liste von Ergebnissen laed
	 * @return ergebnisliste
	 */
	public Liste lade() throws IOException {
		Liste ergebnisliste = new VerketteteListe();
		Iterator iterator = (Iterator)ergebnisliste.erzeuge_Iterator();
		iterator.anfang();
		ArrayList <String> zeilenAusDatei = ladeAusDatei();
		for(int i = 0; i < zeilenAusDatei.size(); i++) {
			String aktuelleZeile = zeilenAusDatei.get(i);
			aktuelleZeile = komprimiermethode.expandieren(aktuelleZeile);
			Ergebnis ergebnisAusAktuellerZeile =  convertiereStringAusDateiZumErgebnis(aktuelleZeile, caesarSchluessel);
			ergebnisliste.setze_an_Ende(ergebnisAusAktuellerZeile);
		}
		return ergebnisliste;
	}
	/**
	 * Methode welche eine uebergebene Ergebnisliste in abspeichert
	 * @param ergebnisliste
	 */
	public void speichere(Liste ergebnisliste) throws IOException {
		ArrayList<String> inhaltZumSchreibenInDatei = new ArrayList<String>();
		Iterator iterator = (Iterator) ergebnisliste.erzeuge_Iterator();
		iterator.anfang();
		kryptomethode.Schluessel(caesarSchluessel+"");
		while(!iterator.nach_ende()) {
			Ergebnis aktuellesErgebnis = (Ergebnis)iterator.element();
			StringBuffer nameAusAktuellemErgebnis = new StringBuffer().append(aktuellesErgebnis.name);
			kryptomethode.verschluesseln(nameAusAktuellemErgebnis);
			String zeileZumSchreibenInDatei = nameAusAktuellemErgebnis.toString()+","+aktuellesErgebnis.reihenlaenge+","+aktuellesErgebnis.spielzeitInSekunden+"\n";
			zeileZumSchreibenInDatei = komprimiermethode.komprimieren(zeileZumSchreibenInDatei);
			inhaltZumSchreibenInDatei.add(zeileZumSchreibenInDatei);
			iterator.weiter();
		}
		speichereInDatei(inhaltZumSchreibenInDatei);
		
	}
	private ArrayList<String> ladeAusDatei() throws IOException {
		ArrayList<String> dateiInhalt = new ArrayList<String>();
		BufferedReader dateiLeser = new BufferedReader(new FileReader(dateiName));
		String zeile;
		while((zeile = dateiLeser.readLine())!= null) {
			dateiInhalt.add(zeile);
		}
		return dateiInhalt;
	}
	private void speichereInDatei(ArrayList<String> inhaltZumSchreibenInDatei) throws IOException {
		BufferedWriter dateiSchreiber = new BufferedWriter(new FileWriter(dateiName));
		for(int i = 0; i< inhaltZumSchreibenInDatei.size(); i++ ) {
			dateiSchreiber.write(inhaltZumSchreibenInDatei.get(i));
		}
		dateiSchreiber.close();
	}
	private Ergebnis convertiereStringAusDateiZumErgebnis(String zeileAusDateiZumKonvertieren, int caesarSchluessel) {
		String [] stringsAusDateiAufgeteilt = zeileAusDateiZumKonvertieren.split(",");
		String nameEntschluesselt = stringsAusDateiAufgeteilt[0];
		StringBuffer nameEntschluesseltAlsStringBuffer = new StringBuffer().append(nameEntschluesselt);
		kryptomethode.Schluessel(caesarSchluessel+"");
		kryptomethode.entschluesseln(nameEntschluesseltAlsStringBuffer);
		nameEntschluesselt = nameEntschluesseltAlsStringBuffer.toString();
		return new Ergebnis(nameEntschluesselt, Integer.parseInt(stringsAusDateiAufgeteilt[1]),Integer.parseInt(stringsAusDateiAufgeteilt[2]));
	}
}
