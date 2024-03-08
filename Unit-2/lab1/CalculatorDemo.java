package lab1;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println("Addition Result "+c1.add(10, 20));
		System.out.println("Subtraction Result "+c1.subtraction(20, 10));
		System.out.println("Product Result "+c1.multiply(10, 20));
		System.out.println("Division Result "+c1.division(20, 10));
	}

}
