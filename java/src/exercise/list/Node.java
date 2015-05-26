package exercise.list;

import java.util.LinkedList;

public class Node {

	private int value;
	private Node next;

	public Node(int value, Node next) {
		this.setValue(value);
		this.setNext(next);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	private static LinkedList<Integer> output;

	public static LinkedList<Integer> convertToArray(Node n) {
		output = new LinkedList<Integer>();
		toArray(n);
		return output;
	}
	private static void toArray(Node n) {
		output.add(n.getValue());
		
		if (n.getNext() != null)
			toArray(n.getNext());
	}
}
