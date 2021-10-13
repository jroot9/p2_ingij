package de.janreuteringimp2;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import de.janreuteringimp2.Liste.ende_Ausnahme;
import de.janreuteringimp2.Liste.leer_Ausnahme;
import de.janreuteringimp2.VerketteteListe.Iterator;

public class DatenspeicherTest {
	@Test public void ladeTest() {
		Datenspeicher datenspeicherTestObjekt = new Datenspeicher("TestFileZumLaden.txt");
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("TestFileZumLaden.txt"));
			bufferedWriter.write("Lepps,5,5\n");
			bufferedWriter.write("Lyisiei,10,10");
			bufferedWriter.close();
			Liste testListe = datenspeicherTestObjekt.lade();
			Iterator iterator = (Iterator) testListe.erzeuge_Iterator();
			iterator.anfang();
			Ergebnis ergebnisZumVergleichen = (Ergebnis) iterator.element();
			Ergebnis ergebnisManuellErstellt = new Ergebnis("Hallo",5,5);
			assertEquals("Laden aus Datei funktioniert nicht.", ergebnisManuellErstellt.name, ergebnisZumVergleichen.name);
			iterator.weiter();
			ergebnisZumVergleichen = (Ergebnis)iterator.element();
			ergebnisManuellErstellt = new Ergebnis("Hueoeae",10,10);
			assertEquals("Laden aus Datei funktioniert nicht.", ergebnisManuellErstellt.name, ergebnisZumVergleichen.name);
		} catch (IOException e) {
			e.getCause();
		}
		
		
	}
	@Test public void speichereTest() {
		Datenspeicher datenspeicherTestObjekt = new Datenspeicher("TestDateiZumSpeichern.txt");
		try {
			VerketteteListe testListe = new VerketteteListe();
			testListe.setze_an_Anfang(new Ergebnis("Hüöä!", 10, 10));
			testListe.setze_an_Anfang(new Ergebnis("Hallo",5,5));
			datenspeicherTestObjekt.speichere(testListe);
			BufferedReader bufferedReader = new BufferedReader(new FileReader("TestDateiZumSpeichern.txt"));
			assertEquals("Speichern von Spieldaten funktioniert nicht.","Lepps,5,5",bufferedReader.readLine());
			assertEquals("Speicher von Spieldaten funktioniert nicht.","Lyisiei,10,10",bufferedReader.readLine());
		} catch (IOException e) {
			e.getCause();
		}
	}
	@Test public void ladeLeereDateiTest() throws IOException {
		Datenspeicher datenspeicherTestObjekt = new Datenspeicher("TestFileZumLaden.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("TestFileZumLaden.txt"));
		bufferedWriter.close();
		try {
			Liste testListe = datenspeicherTestObjekt.lade();
			Iterator iterator = (Iterator) testListe.erzeuge_Iterator();
			iterator.anfang();
			Ergebnis ergebnisZumVergleichen = (Ergebnis) iterator.element();
			assertEquals("Liste ist nicht leer",null,ergebnisZumVergleichen);
		} catch (ende_Ausnahme e) {
			e.getMessage();
		}
	}
	
}
