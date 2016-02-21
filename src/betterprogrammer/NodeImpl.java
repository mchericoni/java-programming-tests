package betterprogrammer;

import java.util.List;

public class NodeImpl<E> implements Node {
	private List<Node> children;
	private int value;

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public List<Node> getChildren() {
		return children;
	}

	public NodeImpl(int value) {
		super();
		this.value = value;
	}

	public void setChildren(List<E> children) {
		this.children = (List<Node>) children;
	}

}
