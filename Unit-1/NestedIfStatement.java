import java.util.Scanner;
public class NestedIfStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any 3 Numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1 +" is Big");
			}else {
				System.out.println(num3 +" is Big");
			}
		}else {
			if(num2 > num3) {
				System.out.println(num2 +" is Big");
			}else {
				System.out.println(num3 +" is Big");
			}
		}
		input.close();
	}
}
