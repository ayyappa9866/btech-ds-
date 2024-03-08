package exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Example5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		try{
			a = input.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		
		System.out.println("Rest Of the code");
	}
}
