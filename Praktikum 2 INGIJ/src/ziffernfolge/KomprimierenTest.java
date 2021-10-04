package ziffernfolge;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class KomprimierenTest {
	Komprimieren komprimierung =new Komprimieren();
	String soll;
	String ist;

	@Test
	public void Komprimierung_komprimieren() {
		soll="5a2b";
		ist = komprimierung.komprimieren("aaaaabb");
		assertEquals("Fehler",soll,ist);
		
		soll="1a2b";
		ist = komprimierung.komprimieren("abb");	
		assertEquals("Fehler",soll,ist);
		
		soll="8w2e";
		ist = komprimierung.komprimieren("wwwwwwwwee");
		assertEquals("Fehler",soll,ist);
	}


	@Test
	public void Komprimierung_expandieren() {
		soll="HHHHHaaaaaallllllloooooooo";
		ist=komprimierung.expandieren("5H6a7l8o");
		assertEquals("Fehler",soll,ist);
		
		soll="wwwtttttt";
		ist=komprimierung.expandieren("3w6t");
		assertEquals("Fehler",soll,ist);
		
		soll="uuuppppp";
		ist=komprimierung.expandieren("3u5p");
		assertEquals("Fehler",soll,ist);
		
	}

}

