package arraysexamples;

public class OneDArrays {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		for(int i = 0;i < arr.length;i++) {
			arr[i] = i + 10;
		}
		System.out.println("Array Elements Are :");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
