package de.janreuteringimp2;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import de.janreuteringimp2.VerketteteListe.Iterator;

public class DatenspeicherTest {
	@Test public void ladeTest() {
		Datenspeicher datenspeicherTestObjekt = new Datenspeicher("TestFileZumLaden.txt");
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("TestFileZumLaden.txt"));
			bufferedWriter.write("Tmxxa,5,5");
			VerketteteListe testListe = datenspeicherTestObjekt.lade();
			Iterator iterator = (Iterator) testListe.erzeuge_Iterator();
			iterator.anfang();
			Ergebnis ergebnisZumVergleichen = (Ergebnis) iterator.element();
			Ergebnis ergebnisManuellErstellt = new Ergebnis("Hallo",5,5);
			assertEquals("Laden aus Datei funktioniert nicht.", ergebnisZumVergleichen, ergebnisManuellErstellt);
		} catch (IOException e) {
			e.getCause();
		}
		
		
	}
	@Test public void speichereTest() {
		Datenspeicher datenspeicherTestObjekt = new Datenspeicher("TestDateiZumSpeichern.txt");
		try {
			VerketteteListe testListe = new VerketteteListe();
			testListe.setze_an_Anfang(new Ergebnis("Hallo",5,5));
			datenspeicherTestObjekt.speichere(testListe);
			BufferedReader bufferedReader = new BufferedReader(new FileReader("TestDateiZumSpeichern.txt"));
			assertEquals("Speichern von Spieldaten funktioniert nicht.",bufferedReader.readLine(),"Tmxxa,5,5");
		} catch (IOException e) {
			e.getCause();
		}
	}
}
