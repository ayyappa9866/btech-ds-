package methodoverloading;

public class CuboidDemo {

	public static void main(String[] args) {
		Cuboid c1 = new Cuboid();
		Cuboid c2 = new Cuboid(5.5);
		Cuboid c3 = new Cuboid(5.5,3.5,2.5);
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println(c3);

	}

}
