package exercise.list;

import static exercise.list.Node.convertToArray;
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatedElementsLinkedListTest {

	RemoveDuplicatedElementsLinkedList removeDuplicated = new RemoveDuplicatedElementsLinkedList();
	
	@Test
	public void singleNodeList() {
		Node n1 = new Node(10, null);
		
		removeDuplicated.remove(n1);
		LinkedList<Integer> list = convertToArray(n1);
		
		LinkedList<Integer> exp = new LinkedList<Integer>();
		exp.add(10);
		
		Assert.assertEquals(exp, list);
	}
	
	@Test
	public void noDuplicatedNodesList() {
		Node n3 = new Node(10, null);
		Node n2 = new Node(4, n3);
		Node n1 = new Node(1, n2);
		
		LinkedList<Integer> list = convertToArray(n1);
		LinkedList<Integer> exp = new LinkedList<Integer>();
		exp.add(1);
		exp.add(4);
		exp.add(10);
		
		assertEquals(exp, list);
	}
	
	@Test
	public void threeDuplicatedElements() {
		Node n4 = new Node(7, null);
		Node n3 = new Node(7, n4);
		Node n2 = new Node(5, n3);
		Node n1 = new Node(7, n2);
		Node n0 = new Node(1, n1);
		
		removeDuplicated.remove(n0);
		
		LinkedList<Integer> list = convertToArray(n0);
		LinkedList<Integer> exp = new LinkedList<Integer>();
		exp.add(1);
		exp.add(7);
		exp.add(5);
		
		
		assertEquals(exp, list);
	}
	
	@Test
	public void multiplesDuplication() {
		Node n4 = new Node(5, null);
		Node n3 = new Node(7, n4);
		Node n2 = new Node(5, n3);
		Node n1 = new Node(7, n2);
		Node n0 = new Node(5, n1);
		
		removeDuplicated.remove(n0);
		
		LinkedList<Integer> list = convertToArray(n0);
		LinkedList<Integer> exp = new LinkedList<Integer>();
		exp.add(5);
		exp.add(7);
		
		assertEquals(exp, list);
	}
	
	@Test
	public void multiplesDuplicationIteratively() {
		Node n4 = new Node(5, null);
		Node n3 = new Node(7, n4);
		Node n2 = new Node(5, n3);
		Node n1 = new Node(7, n2);
		Node n0 = new Node(5, n1);
		
		removeDuplicated.removeIteratively(n0);
		
		LinkedList<Integer> list = convertToArray(n0);
		LinkedList<Integer> exp = new LinkedList<Integer>();
		exp.add(5);
		exp.add(7);
		
		assertEquals(exp, list);
	}

}
