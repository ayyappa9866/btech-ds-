package methodoverloading;
public class Cuboid {
	public double length;
	public double breadth;
	public double height;
	public Cuboid() {
		length = 0.0;
		breadth = 0.0;
		height = 0.0;
	}
	public Cuboid(double length) {
		this.length = length;
		breadth = length;
		height = length;
	}
	public Cuboid(double length,double breadth,double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public double volume() {
		return length * breadth * height;
	}
	public String toString() {
		return "Length : "+length+"\nBreadth : "+breadth+"\nHeight : "+height+"\nVolume : "+volume();
	}
}
