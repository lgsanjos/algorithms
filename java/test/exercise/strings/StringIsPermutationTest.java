package exercise.strings;
import org.junit.Assert;
import org.junit.Test;

import exercise.strings.StringIsPermutation;

public class StringIsPermutationTest {
	
	StringIsPermutation p = new StringIsPermutation();
	
	@Test
	public void verifyNotPermutation() {
		Assert.assertFalse(p.isPermutation("asdf", "asfb"));
	}
	
	@Test
	public void verifyPermutation() {
		Assert.assertFalse(p.isPermutation("adsddfB", "dddBdasf"));
	}

}
