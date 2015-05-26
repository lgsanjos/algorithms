package exercise.strings;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Test;

public class RotateIntoNewMatrixNNTest {

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
		
		int[][] output = new RotateIntoNewMatrixNN().rotateClockWise(matrix);
		assertTrue(Arrays.deepEquals(output, matrixExpected));
	}

	@Test
	public void rotateAntiClockWise() {
		
		int[][] matrix = {
				  { 1, 2, 3 },
				  { 4, 5, 6 },
				  { 7, 8, 9 }
				};
		
		int[][] matrixExpected = {
				  { 3, 6, 9 },
				  { 2, 5, 8 },
				  { 1, 4, 7 }
				};
		
		int[][] output = new RotateIntoNewMatrixNN().rotateAntiClockWise(matrix);
		assertTrue(Arrays.deepEquals(output, matrixExpected));
	}

}
