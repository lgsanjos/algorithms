package exercise.strings;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RotateMatrixNNInPlaceTest {
	
	@Test
	public void transposeTest() {
		int[][] m =
			{
				{ 1, 2, 3},
				{ 4, 5, 6},
				{ 7, 8, 9}
			};
				
		int[][] transposed =
			{
				{ 1, 4, 7},
				{ 2, 5, 8},
				{ 3, 6, 9}
			};
		
		int[][] out = new RotateMatrixNNInPlace().transpose(m);
		Assert.assertTrue(Arrays.deepEquals(out, transposed));
	}
	
	@Test
	public void rotateClockWise() {
		
		int[][] matrix = {
				  { 1, 2, 3 },
				  { 4, 5, 6 },
				  { 7, 8, 9 }
				};
		
		int[][] matrixExpected = {
				  { 7, 4, 1 },
				  { 8, 5, 2 },
				  { 9, 6, 3 }
				};
		
		int[][] output = new RotateMatrixNNInPlace().rotate90ClockWise(matrix);
		assertTrue(Arrays.deepEquals(output, matrixExpected));
	}

}
