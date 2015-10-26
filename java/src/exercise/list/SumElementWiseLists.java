package exercise.list;

public class SumElementWiseLists {

	private int co;

	public int iterativeSum(Node n1, Node n2) {
		
		if  (n1 == null || n2 == null)
			return -1;
		
		StringBuilder s1 = collectData(n1);
		StringBuilder s2 = collectData(n2);
		
		return  Integer.valueOf(s1.toString()) + Integer.valueOf(s2.toString()); 
	}

	private StringBuilder collectData(Node n) {
		Node nextN = n;
		StringBuilder s = new StringBuilder();
		while (nextN != null) {
			s.append(nextN.getValue());
			nextN = nextN.getNext();
		}
		return s;
	}
	
	private int sum2(Node n1, Node n2) {
		int acc = 0;
		
		if (n1.getNext() != null)
		  acc = sum2(n1.getNext(), n2.getNext());	

		int s = n1.getValue() + n2.getValue() + co;
		co = s / 10;
		int numb = s % 10;

		
		if (n1.getNext() == null)
			return Integer.valueOf(String.valueOf(numb));
		
		return Integer.valueOf(String.valueOf(numb) + String.valueOf(acc));
	}
	
	public int sum(Node n1, Node n2) {
		int s = sum2(n1,n2);
		if (co > 0) {
			return Integer.valueOf(String.valueOf(co) + String.valueOf(s));
		} 
		
		return s;
	}
}
