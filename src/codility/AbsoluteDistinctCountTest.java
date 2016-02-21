package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbsoluteDistinctCountTest {

	@Test
	public void testAbsDistinctCount() {
		assertEquals(1, AbsoluteDistinctCount.absDistinctCount(new int[] { 0 }));
		assertEquals(
				5,
				AbsoluteDistinctCount.absDistinctCount(new int[] { 1, 2, 3, 4,
						5 }));
		assertEquals(
				4,
				AbsoluteDistinctCount.absDistinctCount(new int[] { -5, -3, 0,
						1, -3 }));
	}

	@Test
	public void testCountDistinctUsingSet() {
		assertEquals(1,
				AbsoluteDistinctCount.countDistinctUsingSet(new int[] { 0 }));
		assertEquals(
				5,
				AbsoluteDistinctCount.countDistinctUsingSet(new int[] { 1, 2,
						3, 4, 5 }));
		assertEquals(
				4,
				AbsoluteDistinctCount.countDistinctUsingSet(new int[] { -5, -3,
						0, 1, -3 }));
	}

}
