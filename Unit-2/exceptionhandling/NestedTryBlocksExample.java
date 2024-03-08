package exceptionhandling;
public class NestedTryBlocksExample {
	public static void main(String[] args) {
		int data = 0;
		int []arr = new int[10];
		String str = null;
		try {			
			try {
				data = 50 / 0;
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			try {
				arr[10] = 100;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println(str.length());
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			int a = Integer.parseInt("abc");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest Of The Code");
	}
}
