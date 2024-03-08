package exceptionhandling;

public class Example2 {

	public static void main(String[] args) {
		String s = null;
//		System.out.println(s.length());
//		System.out.println("rest Of the code");
		try {
			System.out.println(s.length());
			System.out.println("I am in try block");
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("rest Of the code");

	}

}
