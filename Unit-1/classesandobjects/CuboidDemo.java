package classesandobjects;
import java.util.Scanner;
public class CuboidDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length,breadth and Height :");
		double len = input.nextDouble();
		double bre = input.nextDouble();
		double hei = input.nextDouble();
		Cuboid c1 = new Cuboid(len,bre,hei);
		System.out.println(c1.volume());
		System.out.println("Enter Length,breadth and Height :");
		double len1 = input.nextDouble();
		double bre1 = input.nextDouble();
		double hei1 = input.nextDouble();
		Cuboid c2 = new Cuboid(len1,bre1,hei1);
		System.out.println(c2.volume());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		
		input.close();
	}
}
