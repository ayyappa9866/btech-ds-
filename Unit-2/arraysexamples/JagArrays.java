package arraysexamples;
public class JagArrays {
	public static void main(String[] args) {		
//		int arr[] = {1,2,3,4};
//		int arr1[] = new int[] {1,2,3,4};
//		int brr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		int crr[][] = {new int[]{1,2,3},new int[]{4,5,6},new int[] {7,8,9}};
		int[][] drr = new int[3][];		
		drr[0] = new int[]{1,2,3,4};
		drr[1] = new int[]{5,6};
		drr[2] = new int[]{9};		
		System.out.println("Array Elements Are:");
		for(int i = 0;i < drr.length;i++) {
			for(int j = 0;j < drr[i].length;j++) {
				System.out.print(drr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
