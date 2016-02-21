package betterprogrammer;

import java.util.ArrayList;
import java.util.List;

public class ListNodeTask {
	public static ListNode reverse(ListNode node) {
		/*
		 * Please implement this method to reverse a given linked list.
		 */

		// NOTE: This solution works by first copying all elements in a List
		List<ListNode> list = new ArrayList<ListNode>();
		list.add(node);

		ListNode nextNode = node.getNext();
		while (nextNode != null) {
			list.add(nextNode);
			nextNode = nextNode.getNext();
		}

		for (int i = list.size() - 1; i > 0; i--) {
			ListNode aNode = list.get(i);
			aNode.setNext(list.get(i - 1)); // next is the previous
		}
		node.setNext(null); // first element

		return list.get(list.size() - 1);
	}

	public static ListNode reverse2(ListNode node) {
		ListNode currentNode, nextNode, loopNode = null;
		currentNode = node;
		nextNode = currentNode.getNext();

		while (nextNode != null) {
			currentNode.setNext(loopNode);
			loopNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.getNext();
		}

		currentNode.setNext(loopNode); // last element

		return currentNode;
	}

	// Not necessary to solve this problem
	public static ListNode getLastNode(ListNode node) {
		if (node.getNext() == null)
			return node;
		else
			return getLastNode(node.getNext());
	}
}
