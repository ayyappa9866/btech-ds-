package stringexamples;

public class StringExample1 {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Hello";
		String s4 = new String("Welcome");		
		if(s1 == s4) {
			System.out.println("Both are Refering same object");
		}else {
			System.out.println("Both are Refering Different objects");
		}
	}

}
