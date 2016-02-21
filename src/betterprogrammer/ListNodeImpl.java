package betterprogrammer;

public class ListNodeImpl implements ListNode {

	private ListNode nextNode;
	private int id;

	public ListNodeImpl(int id) {
		super();
		this.id = id;
	}

	@Override
	public int getItem() {
		return id;
	}

	@Override
	public ListNode getNext() {
		return nextNode;
	}

	@Override
	public void setNext(ListNode next) {
		this.nextNode = next;
	}

	@Override
	public String toString() {
		return "ListNodeImpl [id=" + id + "]";
	}

}
