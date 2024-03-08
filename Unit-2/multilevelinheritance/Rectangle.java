package multilevelinheritance;
public class Rectangle extends GeometricShape{
	protected double length;
	protected double width;
	protected Rectangle(String color,boolean filled,double length,double width){
		super(color,filled);
		this.length = length;
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public String toString() {
		return super.toString()+"\nLength : "+length+"\nWidth : "+width;
	}
}
