package Compose;

public class File extends Node {

	public File(String name) {
		super(name);
	}

	@Override
	protected void add(Node child) {
		System.out.println("��������ӽڵ㡣");
	}

}
