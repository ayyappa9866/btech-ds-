package exceptionhandling;
public class Example6 {
	public static void main(String[] args) {
		int data = 0;
		int []arr = new int[10];
		String str = null;
		try {
			data = 50 / 0;
			arr[10] = 100;
			System.out.println(str.length());
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("I am in Finally Block");
		}
		System.out.println("Rest Of The Code");
	}
}
