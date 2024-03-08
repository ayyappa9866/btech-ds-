package stringexamples;

public class StringExample2 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "HellO";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("Length of the string: "+s1.length());
		System.out.println(s1.concat(" Welcome"));
		System.out.println(s1.endsWith("llo"));
		System.out.println(s1.lastIndexOf('l'));
		System.out.println(s1.replace('l', 'H'));
		char[] ch1 = s1.toCharArray();
		String s3 = "       Hai How are you         ";
		System.out.println(s3);
		System.out.println(s3.trim());
		System.out.println(s3.toUpperCase().trim());
		System.out.println(s3.toLowerCase());
		String sen = "Hai,how,are,you,i,am,fine";
		String[] str = sen.split(",");
		for(int i = 0;i < str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}
}
