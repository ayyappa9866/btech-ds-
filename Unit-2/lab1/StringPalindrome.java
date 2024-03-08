package lab1;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any String : ");
		String str = input.next();
		boolean flag = true;
		for(int i = 0,j = str.length()- 1;i < j;i++,j--) {
			if(str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		input.close();
	}
}
