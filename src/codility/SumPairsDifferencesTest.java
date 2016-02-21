package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumPairsDifferencesTest {

	@Test
	public void testSumOfDifferences() {
		assertEquals(-1, SumPairsDifferences.sumOfDifferences(null));
		assertEquals(-1, SumPairsDifferences.sumOfDifferences(new int[] {}));
		assertEquals(-1, SumPairsDifferences.sumOfDifferences(new int[] { 0 }));
		assertEquals(17,
				SumPairsDifferences.sumOfDifferences(new int[] { 2, 3, 5, 7 }));
	}

	@Test
	public void testSumOfDifferences_2() {

		assertEquals(-1, SumPairsDifferences.sumOfDifferences_2(null));
		assertEquals(-1, SumPairsDifferences.sumOfDifferences_2(new int[] {}));
		assertEquals(-1,
				SumPairsDifferences.sumOfDifferences_2(new int[] { 0 }));
		assertEquals(17, SumPairsDifferences.sumOfDifferences_2(new int[] { 2,
				3, 5, 7 }));
	}
}
