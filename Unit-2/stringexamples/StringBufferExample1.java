package stringexamples;

public class StringBufferExample1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Welcome");
		sb1.append(" TO Veltech");
		System.out.println(sb1);
		System.out.println(sb1.substring(11));
		sb1.deleteCharAt(8);
		System.out.println(sb1);
		sb1.replace(0, 3, "Hai");
		System.out.println(sb1);
	}
}
