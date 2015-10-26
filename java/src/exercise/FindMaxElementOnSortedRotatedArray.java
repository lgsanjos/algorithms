package exercise;

public class FindMaxElementOnSortedRotatedArray {

	private static int bs(int[] a, int start, int end) {
		int pivot = (start + end) / 2;
		
		System.out.println("start= " + start);
		System.out.println("end= " + end);
		System.out.println("pivot= " + pivot);
		System.out.println(" ");
		
		
		if (start == end)
			return a[start];
		
		if (a[pivot] < a[start]) {
			return bs(a, start, pivot -1);
		}
		
		if (a[pivot] > a[end]) {
			return bs(a, pivot, end -1);
		} else { 
			return bs(a, pivot +1, end);
		}
	
	}
	
	private static int find(int[] a) {
		return bs(a, 0, a.length-1);
	}
	
	public static void main(String[] args) {
	 int[] a = { 1, 2, 3, 4, 5, 6};
	 System.out.println(find(a));
	}
}
