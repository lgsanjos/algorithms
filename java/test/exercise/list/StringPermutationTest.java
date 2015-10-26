package exercise.list;

import java.util.Arrays;

import org.junit.Test;

import exercise.strings.StringPermutation;

public class StringPermutationTest {

	@Test
	public void bla() {
		StringPermutation s = new StringPermutation();
		String[] all = s.all("abcde");
	}
	
	@Test
	public void lookForAnagrams() {
		String[] a = {"abc", "cba","b", "bar", "bac", "a"};
		StringPermutation s = new StringPermutation();
		String[] r = s.allAnagrams(a, "acb");
		System.out.println(Arrays.toString(r));
	}
}
