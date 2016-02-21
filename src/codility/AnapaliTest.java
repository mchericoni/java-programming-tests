package codility;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnapaliTest {

	@Test
	public void testCheck() {
		assertTrue(Anapali.check("bacba", "abcba"));
		assertTrue(Anapali.check("bacbabb", "abbcbba"));
		assertTrue(Anapali.check("bacbac", "abccba"));
		assertFalse(Anapali.check("acca", "abcba"));
		assertFalse(Anapali.check("abdba", "abcba"));
		assertFalse(Anapali.check("fbcbf", "abcba"));
		assertFalse(Anapali.check("ffffff", "abccba"));
	}

	@Test
	public void testCheck2() {
		assertTrue(Anapali.check2("bacba", "abcba"));
		assertTrue(Anapali.check2("bacbabb", "abbcbba"));
		assertTrue(Anapali.check2("bacbac", "abccba"));
		assertFalse(Anapali.check2("acca", "abcba"));
		assertFalse(Anapali.check2("abdba", "abcba"));
		assertFalse(Anapali.check2("fbcbf", "abcba"));
		assertFalse(Anapali.check2("ffffff", "abccba"));
	}
}
