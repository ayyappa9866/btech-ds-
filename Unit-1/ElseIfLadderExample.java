import java.util.Scanner;
public class ElseIfLadderExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Temparature : ");
		double temp = input.nextDouble();
		if(temp < 0) {
			System.out.println("Freezing weather");
		}else if(temp <= 10) {
			System.out.println("Very Cold weather");
		}else if(temp <= 20) {
			System.out.println("Cold weather");
		}else if(temp <= 30) {
			System.out.println("Normal Weather");
		}else if(temp <= 40) {
			System.out.println("It’s Hot");
		}else {
			System.out.println("It’s Very Hot");
		}		
		input.close();
	}
}