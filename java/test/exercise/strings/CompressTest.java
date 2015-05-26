package exercise.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercise.strings.Compress;

public class CompressTest {
	
	Compress compressor = new Compress();
	
	@Test 
	public void compressSimpleString() {
		String input  = "aaatchiiiinnn";
		String output = "a3t1c1h1i4n3";
		
		String result = compressor.compress(input);
		
		assertEquals(output, result);
		assertEquals(13, input.length());
		assertEquals(12, output.length());
	}

	@Test 
	public void dontCompressEnough() {
		String input  = "aaabbcdefghi";
		String output = "aaabbcdefghi";
		
		String result = compressor.compress(input);
		
		assertEquals(output, result);
	}
}
