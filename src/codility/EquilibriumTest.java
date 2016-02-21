package codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EquilibriumTest {

	@Test
	public void testEqui() {
		assertEquals(-1, Equilibrium.equi(null));
		assertEquals(-1, Equilibrium.equi(new int[] {}));
		assertEquals(0, Equilibrium.equi(new int[] { 0 }));
		assertEquals(3, Equilibrium.equi(new int[] { -7, 1, 5, 2, -4, 3, 0 }));
		assertEquals(1, Equilibrium.equi(new int[] { 6, 1, 2, 1, 1, 1, 1 }));
	}

}
