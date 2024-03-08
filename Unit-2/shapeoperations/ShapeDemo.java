package shapeoperations;

public class ShapeDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.5);
		System.out.println(c1.calculateArea());
		System.out.println(c1.calculateCircumference());
		System.out.println();
		Square s1 = new Square(5.5);
		System.out.println(s1.calculateArea());
		System.out.println(s1.calculatePerimeter());

	}

}
