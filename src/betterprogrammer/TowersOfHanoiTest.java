package betterprogrammer;

import org.junit.Test;

public class TowersOfHanoiTest {

	@Test
	public void testTransferFromAtoC() {
		System.out.println(TowersOfHanoi.transferFromAtoC(4));
		System.out.println(TowersOfHanoi.transferFromAtoC(3));
	}

}
