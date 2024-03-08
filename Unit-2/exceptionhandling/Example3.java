package exceptionhandling;

public class Example3 {

	public static void main(String[] args) {
		
		int []arr = new int[10];
		try {
			System.out.println(arr[10]);
			System.out.println("I am in try block");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handled");
		}
		System.out.println("rest Of the code");

	}

}
