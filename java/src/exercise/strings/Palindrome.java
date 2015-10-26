package exercise.strings;

public class Palindrome {
	
	public Boolean isPalindrome(String s) {
		s = s.replace(" ", "");
		s = s.toUpperCase();
		
		int mid = (s.length() / 2 ) - 1;
		for (int i = 0; i < mid; i++) {
			if (s.charAt(i) != s.charAt(s.length() -1 - i))
				return false;
		}
		
		return true;
	}

}
