package test;

public class Tree {
	private Node root;

	public Tree(Node root) {
		super();
		this.root = root;
	}

	public Node find(int data) {
		return root == null ? null : root.find(data);
	}

	public Node findchild(int data) {
		return this.findchild(data);
	}

	public void print() {
		root.print();
	}

	public boolean insert(int parentData, int data, int count) {
		Node pr = root.find(parentData);
		if (pr == null)
			return false;
		pr.getChidren().add(new Node(data, count));
		return true;
	}

	public boolean insert2(Node parentData, Node node) {
		if (parentData == null)
			return false;
		parentData.getChidren().add(node);
		return true;
	}
}