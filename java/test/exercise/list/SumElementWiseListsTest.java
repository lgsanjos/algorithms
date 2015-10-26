package exercise.list;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class SumElementWiseListsTest {
	
	@Test
	public void sumListsSimple() {
		Node n2 = new Node(0, null);
		Node n1 = new Node(0, n2);
		Node n0 = new Node(1, n1);
		
		Node n02 = new Node(1, null);
		Node n01 = new Node(1, n02);
		Node n00 = new Node(3, n01);
		
		SumElementWiseLists s = new SumElementWiseLists();
		
		assertEquals(411, s.sum(n0, n00));
	}

	
	@Test
	public void sumListsSimpleWithCarryOver() {
		Node n2 = new Node(8, null);
		Node n1 = new Node(8, n2);
		Node n0 = new Node(1, n1);
		
		Node n02 = new Node(5, null);
		Node n01 = new Node(2, n02);
		Node n00 = new Node(3, n01);
		
		SumElementWiseLists s = new SumElementWiseLists();
		
		assertEquals(513, s.sum(n0, n00));
	}
	
	@Test
	public void sumListsSimpleWithCarryOverOnFirstElement() {
		Node n2 = new Node(8, null);
		Node n1 = new Node(8, n2);
		Node n0 = new Node(8, n1);
		
		Node n02 = new Node(5, null);
		Node n01 = new Node(2, n02);
		Node n00 = new Node(3, n01);
		
		SumElementWiseLists s = new SumElementWiseLists();
		
		assertEquals(1213, s.sum(n0, n00));
	}
	
	@Test
	public void sumListWithDifferentSizes() {
		Node n2 = new Node(0, null);
		Node n1 = new Node(0, n2);
		Node n0 = new Node(1, n1);
		
		Node n01 = new Node(2, null);
		Node n00 = new Node(3, n01);
		
		SumElementWiseLists s = new SumElementWiseLists();
		
		assertEquals(132, s.iterativeSum(n0, n00));
	}
}
