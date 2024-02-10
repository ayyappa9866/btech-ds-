package arraysexamples;
public class TwoDArray {
	public static void main(String[] args) {
		
		int arr[][] = new int[3][4];
		
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				arr[i][j] = i + j + 10;
			}
		}
		System.out.println("2D Array Elements Are :");
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
