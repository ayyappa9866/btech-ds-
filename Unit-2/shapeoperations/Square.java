package shapeoperations;

public class Square {
	public double side;
	Square(double side){
		this.side = side;
	}
	public double calculateArea() {
		return side * side;
	}
	public double calculatePerimeter() {
		return 4 * side;
	}
}
