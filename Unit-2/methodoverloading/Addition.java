package methodoverloading;
public class Addition {
	public static int add(int num1,int num2) {
		return num1 + num2;
	}
	public static int add(int num1,int num2,int num3) {
		return num1 + num2 + num3;
	}
	
	public static double add(double ...num) {
		double sum = 0;
		for(double i:num) {
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(add(2,3));
		System.out.println(add(2,3,4));
		System.out.println(add(2.3));
		System.out.println(add(2.3,3.5));
		System.out.println(add());
	}
}
