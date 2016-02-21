package betterprogrammer;

import java.util.Iterator;

public class RootToLeafSum {

	public static int getLargestRootToLeafSum(Node root) {
		/*
		 * A root-to-leaf path in a tree is a path from a leaf node through all
		 * its ancestors to the root node inclusively. A "root-to-leaf sum" is a
		 * sum of the node values in a root-to-leaf path.
		 * 
		 * Please implement this method to return the largest root-to-leaf sum
		 * in the tree.
		 */
		int result = root.getValue();
		if ((root.getChildren() == null) || (root.getChildren().isEmpty())) {
			System.out.println("leaf: " + result);
			return result;
		}

		int max = 0;
		Iterator<Node> i = root.getChildren().iterator();
		while (i.hasNext()) {
			Node node = i.next();
			int current = getLargestRootToLeafSum(node);
			if (current > max)
				max = current;
		}
		System.out.println("returning: " + (result + max));
		return result + max;
	}

}
