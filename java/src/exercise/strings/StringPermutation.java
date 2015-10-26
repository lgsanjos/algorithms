package exercise.strings;

import java.util.Arrays;

public class StringPermutation {

	// sol1: apply heapsort->reverse->bubblesort
	// sol2: 
	
	public String[] all(final String s) {
		String[] a = new String[23];
		
//		for (int i=0; i < s.length(); i++) {
//			perm(s.substring(0,i), s.substring(i), a, 0);
//		}
//	
		permut("", s);
		return a;
	}
	
	
	public void permut(String p, String str){
	    if(str.length() == 0) {
	    	System.out.println(p);
	    	return;
	    }
	    
        char ch = str.charAt(0);
        for(int i = 0; i <= p.length();i++) {
        	String s1 = p.substring(0,i) + ch + p.substring(i,p.length());
        	String s2 = str.substring(1,str.length());
        	permut(s1,s2);
        }
	}

	public int[] countChar(String s) {
		int[] a = new int[128];
		
		for (char c : s.toCharArray()) {
			a[c]++;
		}
		return a;
	}
	public String[] allAnagrams(String[] a, String base) {
		String[] anagrams = new String[a.length];
		int[] b = countChar(base);
		
		for (int i=0; i < a.length -1; i++) {
			int[] n = countChar(a[i]); 
			if (Arrays.equals(b, n))
				anagrams[i] = a[i];
		}
		
		return anagrams;
	}
	
}