package lab1;
import java.util.Scanner;
public class Pangram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any Sentence : ");
		String sen = input.nextLine();
		int arr[] = new int[26];
		boolean flag = true;
		for(int i = 0; i < sen.length();i++) {
			char ch = sen.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				arr[ch - 97]++;
			}else if(ch >= 'A' && ch <= 'Z') {
				arr[ch - 65]++;
			}
		}
		for(int i = 0;i < 26;i++) {
			if(arr[i] == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Pangram");
		}else {
			System.out.println("Not a Pangram");
		}
		input.close();
	}
}
