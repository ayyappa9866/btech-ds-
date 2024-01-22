import java.util.Scanner;
public class StaticMethodExample {

	private static int factorial(int n) {
		int result = 1;
		for(int i = 1;i <= n;i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any +ve Number");
		int num = input.nextInt();
		int res = factorial(num);
		System.out.println(res);

	}
}
