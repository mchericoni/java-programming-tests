package betterprogrammer;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class RootToLeafSumTest {

	@Test
	public void testGetLargestRootToLeafSum() {
		NodeImpl root = new NodeImpl(3);
		NodeImpl node1 = new NodeImpl(1);
		NodeImpl node2 = new NodeImpl(2);
		node1.setChildren(Arrays.asList(new NodeImpl(0), new NodeImpl(4),
				new NodeImpl(2)));
		node2.setChildren(Arrays.asList(new NodeImpl(1), new NodeImpl(2)));
		root.setChildren(Arrays.asList(node1, node2));
		assertEquals(8, RootToLeafSum.getLargestRootToLeafSum(root));
	}

}
