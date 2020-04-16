package Compose;

public abstract class Node {
	protected String name;
	
	public Node(String name) {
		this.name = name;
	}
	
	protected abstract void add(Node child);
}
