package heirarchicalinheritance;
public class Circle extends GeometricShape{
	protected double radius;
	protected Circle(String color,boolean filled,double radius) {
		super(color,filled);
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double area() {
		return Math.PI * radius * radius;
	}
	public String toString() {
		return super.toString()+"\nRadius : "+radius+"\nArea : "+area();
	}
}
