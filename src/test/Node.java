package test;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int data;
	private int count;

	// private Node parent;

	private List<Node> chidren;

	public Node() {
		// TODO Auto-generated constructor stub
		/**
		 * how to add parent to implements step 3 ???
		 */

		this.data = 0;
		this.count = 0;
		this.chidren = new ArrayList<Node>();
	}

	public Node(int data, int count) {
		super();
		this.data = data;
		this.count = count;
		// this.parent = null;
		this.chidren = new ArrayList<Node>();
	}

	Node find(int data) {
		if (this.data == data)
			return this;
		for (Node node : chidren) {
			Node found = node.find(data);
			if (found != null)
				return found;
		}
		return null;
	}

	public void print() {
		System.out.print(this.data + ":" + this.count + " ");
		for (Node node : chidren) {
			node.print();
		}
	}

	Node findchild(int data) {
		for (Node node : chidren) {
			if (node.data == data)
				return node;
		}
		return null;
	}

	public int getData() {
		return data;
	}

	public int getCount() {
		return count;
	}

	public List<Node> getChidren() {
		return chidren;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setChidren(List<Node> chidren) {
		this.chidren = chidren;
	}

}