package exercise.strings;

import java.util.Arrays;

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
}
