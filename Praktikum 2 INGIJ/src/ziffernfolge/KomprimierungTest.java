package ziffernfolge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class KomprimierungTest {

	@Test
	public void Komprimierung_komprimieren() {
		Assert.assertEquals("1a2b",komprimieren("abb"));
	    
		fail("Not yet implemented");
	}


	@Test
	public void Komprimierung_expandieren() {
		Assert.assertEquals("abb", expandieren("1a2b"));
	    Assert.assertEquals("aaaaaaaaaa", expandieren("10a"));
	    Assert.assertEquals("baaaaaaaaaa", expandieren("b10a"));
	    Assert.assertEquals("abab", expandieren("2ab"));
	    Assert.assertEquals("Heeeeeeeeeeeellooooo", expandieren("H9e3e2l5o"));
		fail("Not yet implemented");
	}

}
