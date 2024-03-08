package shapeoperations;

public class Circle {
	public double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
}
