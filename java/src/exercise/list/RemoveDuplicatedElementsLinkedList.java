package exercise.list;

public class RemoveDuplicatedElementsLinkedList {

	private int[] a;
	
	public void remove(Node n1) {
		a = new int[128];
		remove(n1, null);
	}
	
	private void remove(Node n1, Node pn) {
		a[n1.getValue()]++;
		
		if (a[n1.getValue()] > 1) {
			a[n1.getValue()] --;
			pn.setNext( n1.getNext() );
			
			if (n1.getNext() != null)
				remove(n1.getNext(), pn);
		} else {
			if (n1.getNext() != null)
				remove(n1.getNext(), n1);
		}
	}
	
	public void removeIteratively(Node n) {
		int[] a = new int[128];
		
		Node np = n;
		a[np.getValue()] ++;
		
		n = n.getNext();
		while (n != null) {
			a[n.getValue()] ++;
			
			if (a[n.getValue()] > 1) {
				a[n.getValue()] --;
				np.setNext(n.getNext());
			} else {
				np = n;
			}
			n = n.getNext();
		}
	}
	
	
}
