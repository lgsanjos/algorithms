package exercise.strings;

// O(n^2) time and space
public class RotateIntoNewMatrixNN {

	// 1.6
	public int[][] rotateClockWise(int[][] matrix) {
		int s = matrix.length;
		int[][] m = new int[s][s];
		
		for (int l = 0; l < s; ++ l) {
			for (int c = 0; c < s; ++ c) {
				m[l][c] = matrix[s - c - 1][l];
			}
		}
		
		return m;
	}
	
	public int[][] rotateAntiClockWise(int[][] matrix) {
		int s = matrix.length;
		int[][] m = new int[s][s];
		
		print(matrix);
		System.out.println("  -");
		
		for (int c = 0; c < s; c++) {
			for (int l = 0; l < s; l++) {
				m[s - l -1][c] = matrix[c][l];
				print(m);
				System.out.println("  -");
			}
		}
		
		return m;
	}
	
	public void print(int[][] m) {
		
		for (int l = 0; l < m.length; l ++) {
			StringBuffer b = new StringBuffer();
			for (int c = 0; c < m.length; c ++) {
				b.append(m[l][c]);
				b.append(" ");
			}
			System.out.println(b.toString());
		}
	}

}
