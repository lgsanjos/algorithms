package exercise.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Tnode {
  public Tnode(int v) { value = v;}
  public Tnode(int v, Tnode l, Tnode r) { value = v; left = l; right = r;}
  
  public int value;
  public Tnode left;
  public Tnode right;
}
public class TreePrinting {

	Queue<Tnode> q =  new LinkedList<Tnode>();

	public void printTree(Tnode n) {
		StringBuilder output = new StringBuilder();
		Tnode next;

		q.add(n);
		q.add(null);

		while (! q.isEmpty()) {
			next = q.poll();

			if (next == null && q.peek() == null)
				break;
			
			if (next != null) {
				enqueue(next);
				output.append(next.value);
				if (q.peek() != null)					
					output.append(",");
			} else {
				q.add(null);
				output.append("\n");
			} 
			
		}	
		
		System.out.println(output.toString());
	}
	
	public void enqueue(Tnode n) {
		if (n == null) return;
		
		if (n.left != null) q.add(n.left);
		if (n.right != null) q.add(n.right);
	}
	

	public static void main(String[] args) {
	   Tnode n6 = new Tnode(2);

	   Tnode n3 = new Tnode(9);
	   Tnode n4 = new Tnode(4, n6, null);
	   Tnode n5 = new Tnode(5);
	   
	   Tnode n1 = new Tnode(3, n3, null);
	   Tnode n2 = new Tnode(1, n4, n5);
	   
	   Tnode n = new Tnode(5, n1, n2);
		
	   new TreePrinting().printTree(n);
	}
}
