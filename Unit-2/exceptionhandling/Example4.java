package exceptionhandling;

public class Example4 {

	public static void main(String[] args) {
		
		String s1 = "10";
		try {
			System.out.println(Integer.parseInt(s1));
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am in finally Block");
		}		
		System.out.println("Rest of the code");		
	}

}
