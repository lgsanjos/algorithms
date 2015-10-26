package exercise.list;

public class ConvertBSTtoLL {

	static class Tree {
		int value;
		Tree left;
		Tree right;
	}
	
	static class Node {
		int value;
		Node next;
	}

	public Node treeToList(Tree root) {
		Node head = newNode(0, null);
		
		depth(root, head);
		return head.next;
	}
	
	private Node newNode(int value, Node prev) {
		Node n = new Node();
		n.value = value;
		prev.next = n;
		return n;
	}
	
	private void depth(Tree t, Node l) {
		if (t == null)
			return;
		
		depth(t.left, l);
		Node current = newNode(t.value, l);
		depth(t.right, current);
	}
}
