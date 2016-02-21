package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PairSumEvenCountTest {

	@Test
	public void testCountPairs() {
		assertEquals(0, PairSumEvenCount.countPairs(null));
		assertEquals(0, PairSumEvenCount.countPairs(new int[] {}));
		assertEquals(0, PairSumEvenCount.countPairs(new int[] { 0 }));
		assertEquals(4,
				PairSumEvenCount.countPairs(new int[] { 1, 2, 3, 4, 5 }));
	}

}
