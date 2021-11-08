package ziffernfolge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestenlisteTest {
	
	private Benutzeroberflaeche bof;
	Bestenliste bestenliste = new Bestenliste(null);
	

	@Test
	public void maxZeilenTest() {
		for(int i=0;i<12;i++){
		bestenliste.neues_Ergebnis(15, 26);
		bestenliste.zeige_Liste_an();
		}
		
	}
	

}
