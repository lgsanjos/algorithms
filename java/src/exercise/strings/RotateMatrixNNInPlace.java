package exercise.strings;

public class RotateMatrixNNInPlace {

	public int[][] transpose(int[][] m) {
		int swap;
		int s = 3;
		
		for (int c = 0; c < s; c ++) {
			for (int l = 0; l < c ; l++) {
				swap = m[c][l];
				m[c][l] = m[l][c];
				m[l][c] = swap;
			}
		}
		return m;
	}
	
	public int[][] rotate90ClockWise(int[][] m) {
		int s = m.length;
		int swap;

		m = transpose(m);
		for (int l = 0; l < s; l ++) {
			int half = s / 2;
			
			for (int c = 0; c <= half; c ++) {
			  swap = m[l][c];
			  m[l][c] = m[l][s - c -1];
			  m[l][s - c -1] = swap;
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
