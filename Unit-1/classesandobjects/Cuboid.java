package classesandobjects;

public class Cuboid {
	public double length;
	public double breadth;
	public double height;
	
	public Cuboid(double length,double breadth,double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public double volume() {
		return length * breadth * height;
	}
}
