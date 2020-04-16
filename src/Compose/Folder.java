package Compose;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node{
	private List<Node> childrenNodes  = new ArrayList<>();
	
	public Folder(String name) {
		super(name);
	}

	@Override
	protected void add(Node child) {
		childrenNodes.add(child);
		
	}

}
