package exercise.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringIsPermutation {
	
	public StringIsPermutation() {
	}

	public boolean isPermutation(String s1, String s2) {
		char[] ss1 = s1.toCharArray();
		char[] ss2 = s2.toCharArray();
		
		Arrays.sort(ss1);
		Arrays.sort(ss2);
		
		

		return Arrays.equals(ss1, ss2);
	}

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^([A-Z]).*$", Pattern.CANON_EQ);
		boolean a = pattern.matcher("Ólá").matches();
		System.out.println(a);
	}
}
