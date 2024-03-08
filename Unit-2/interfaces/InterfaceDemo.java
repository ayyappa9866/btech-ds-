package interfaces;
public class InterfaceDemo {
	public static void main(String[] args) {
		Calculator c1  = new Calculator();
		System.out.println(c1.add(3, 2));
		System.out.println(c1.sub(5, 2));
		System.out.println(c1.mul(3, 2));
		System.out.println(c1.div(5, 2));

	}
}
