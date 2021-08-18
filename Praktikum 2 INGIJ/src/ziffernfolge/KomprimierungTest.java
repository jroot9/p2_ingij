package ziffernfolge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class KomprimierungTest {
	Komprimierung komprimierung =new Komprimierung();

	@Test
	public void Komprimierung_komprimieren() {
		Assert.assertEquals("1a2b",komprimierung.komprimieren("abb"));
	    
		fail("Not yet implemented");
	}


	@Test
	public void Komprimierung_expandieren() {
		Assert.assertEquals("abb", komprimierung.expandieren("1a2b"));
	    Assert.assertEquals("aaaaaaaaaa", komprimierung.expandieren("10a"));
	    Assert.assertEquals("baaaaaaaaaa", komprimierung.expandieren("b10a"));
	    Assert.assertEquals("abab", komprimierung.expandieren("2ab"));
	    Assert.assertEquals("Heeeeeeeeeeeellooooo", komprimierung.expandieren("H9e3e2l5o"));
		fail("Not yet implemented");
	}

}

