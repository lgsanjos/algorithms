package exercise.list;


public class PartitionArray {

	public void sortOut(int[] a) {
		
		int left=0;
		int right= a.length -1;
		
		//Arrays.sort(a);
		
		int leftSum = a[left];
		int rightSum = a[right];
		
		
		while (right - left != 1) {
			if (leftSum <= rightSum) {
				leftSum += a[++left];
				continue;
			}

			if (rightSum < leftSum) {
				rightSum += a[--right];
			}
		}
		
		System.out.println(left +  " " + leftSum);
		System.out.println("-");
		System.out.println(right + " " +  rightSum);
		
		
	}

}
