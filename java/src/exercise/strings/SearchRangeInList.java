package exercise.strings;

import java.util.LinkedList;

class Fibbonaci {
	private static LinkedList<Integer> l = new LinkedList<Integer>();
	
	public static int getNext() {
		if (l.isEmpty()) {
		  l.add(1);
		  l.add(1);
		}

		int le = l.get(l.size() -1);
		int lle = l.get(l.size() -2);
		l.add( le + lle);
		return l.get(l.size() -1);
	}
	
}
class SearchRangeInList {

  public int count;
	
  public int[] searchFor(int[] a, int v) {
    int firstPos = bsearch(a, v);
	return a;
  }

  
  public int fsearch(int[] a, int v) {
	  return fsearch(a, v, 0, a.length -1);
  }
  
  private int fsearch(int[] a, int v, int min, int max) {
	  count ++;
	  if (min >= max)
		  return -1;
	  
	  int fib = Fibbonaci.getNext();
	  
	  if (v == a[fib])
		  return fib;
	  
	  if (v > a[fib])
		  return fsearch(a, v, fib +1 , max);
	  
	  if (v < a[fib])
		  return fsearch(a, v, min, fib -1);
	  
	  return -1;
  }
  
  public int bsearch(int[] a, int v) {
	if (a.length == 0) // missed empty
		return -1;
	
	if (a.length == 1)
		return (v == a[0]) ? 0 : -1;
	
    return bsearch(a, v, 0, a.length-1);
  }

  private int bsearch(int[] a, int v, int min, int max) {
	 count++;
	 
	 if (min >= max)
		return -1;
	 
	int mid = (max - min / 2);
	
    if (v == a[mid])
        return mid;
    
    if (v > a[mid])
      return bsearch(a, v, mid+1, max);
   
    if ( v < a[mid])
      return bsearch(a, v, min, mid-1);

    return -1;

  }

}
