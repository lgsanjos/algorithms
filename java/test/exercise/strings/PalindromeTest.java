package exercise.strings;


import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
	
	@Test
	public void evenSizedString() {
		Assert.assertTrue(new Palindrome().isPalindrome("anna"));
	}
	
	@Test
	public void oddSizedString() {
		Assert.assertTrue(new Palindrome().isPalindrome("ana"));
	}
	
	@Test
	public void bigPalindrome1() {
		Assert.assertTrue(new Palindrome().isPalindrome("A lad named E Mandala"));
	}
	
	@Test
	public void bigPalindrome2() {
		Assert.assertTrue(new Palindrome().isPalindrome("A Santa dog lived as a devil God at NASA"));
	}

}
