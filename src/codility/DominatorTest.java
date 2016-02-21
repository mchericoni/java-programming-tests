package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DominatorTest {

	@Test
	public void testGetIndexFrom() {
		assertEquals(-1, Dominator.getIndexFrom(null));
		assertEquals(-1, Dominator.getIndexFrom(new int[] {}));
		assertEquals(0, Dominator.getIndexFrom(new int[] { 0 }));
		assertEquals(0, Dominator.getIndexFrom(new int[] { 10 }));
		assertEquals(0, Dominator.getIndexFrom(new int[] { -10 }));

		assertEquals(-1, Dominator.getIndexFrom(new int[] { 1, 2 }));
		assertEquals(-1, Dominator.getIndexFrom(new int[] { -10, 20 }));

		assertEquals(0, Dominator.getIndexFrom(new int[] { 1, 1 }));
		assertEquals(0, Dominator.getIndexFrom(new int[] { -10, -10 }));

		assertEquals(-1, Dominator.getIndexFrom(new int[] { 0, 1, 2, 3, 4, 5 }));

		assertEquals(2,
				Dominator.getIndexFrom(new int[] { 0, 1, 5, 7, 5, 5, 5 }));

		assertEquals(4,
				Dominator.getIndexFrom(new int[] { 0, 1, 4, 7, 5, 5, 5, 5, 5 }));
	}

}
