package basicconcepts;
import java.util.Scanner; // specific import
import java.util.*; // wild card import
public class DataTypes {
	public static void main(String[] args) {
//		System.out.println(12);
//		System.out.println(012);
//		System.out.println(0B1111);
//		System.out.println(0X123);
//		byte num1 = 127;
//		short num2 = 32767;
//		int num3 = 2147483647;
//		long num4 = 9291444345L;
//		float num5 = 1.23556F;
//		double num6 = 1.23;
//		boolean b = true;
//		char c = 'A';
//		System.out.println((double)32/33);
//		Scanner input; // Reference Variable creation
//		input = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID Of a Student : ");
		int num1 = input.nextInt();
		input.nextLine();// previous line remaining data reading till \n
		System.out.println("Enter Name Of a Student");
		String name = input.nextLine();
		System.out.println("Enter Gender Of a Student : ");
		char gender = input.next().charAt(0);
		System.out.println("Enter CGPA : ");
		double cgpa = input.nextDouble();
		System.out.println();
		System.out.println("************************");
		System.out.println("ID : "+num1);
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("CGPA : "+cgpa);																								
	}
}
