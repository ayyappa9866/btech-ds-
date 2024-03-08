package exceptionhandling;
public class Example1 {
	public static void main(String[] args) {
		
		try{
			int data = 50 / 0;
			System.out.println("I am in try");
		}catch(ArithmeticException e) {
			System.out.println(e);
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the statements");

	}
}
