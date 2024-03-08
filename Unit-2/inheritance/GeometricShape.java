package inheritance;


public class GeometricShape {
	protected String color;
	protected boolean filled;
	protected GeometricShape(String color,boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public boolean getFilled() {
		return filled;
	}
	
	public String toString() {
		return "BorderColor : "+color+"\nFilled : "+filled;
	}
}
