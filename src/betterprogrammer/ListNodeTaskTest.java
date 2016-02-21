package betterprogrammer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListNodeTaskTest {

	@Test
	public void testReverse() {
		ListNodeImpl node1 = new ListNodeImpl(1);
		ListNodeImpl node2 = new ListNodeImpl(2);
		ListNodeImpl node3 = new ListNodeImpl(3);

		node1.setNext(node2);
		node2.setNext(node3);

		System.out.println("Last node is: " + ListNodeTask.getLastNode(node1));
		assertEquals(3, ListNodeTask.getLastNode(node1).getItem());

		ListNode result = ListNodeTask.reverse(node1);
		System.out.println(result);

		ListNode nextNode = result.getNext();
		while (nextNode != null) {
			System.out.println(nextNode);
			nextNode = nextNode.getNext();
		}
	}

	@Test
	public void testReverse2() {
		System.out.println("testReverse2");
		ListNodeImpl node1 = new ListNodeImpl(1);
		ListNodeImpl node2 = new ListNodeImpl(2);
		ListNodeImpl node3 = new ListNodeImpl(3);

		node1.setNext(node2);
		node2.setNext(node3);

		ListNode result = ListNodeTask.reverse2(node1);
		System.out.println(result);

		ListNode nextNode = result.getNext();
		while (nextNode != null) {
			System.out.println(nextNode);
			nextNode = nextNode.getNext();
		}
	}
}
