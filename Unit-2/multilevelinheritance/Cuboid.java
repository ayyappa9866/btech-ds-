package multilevelinheritance;
public class Cuboid extends Rectangle{
	protected double height;
	protected Cuboid(String color,boolean filled,double length,double width,double height){
		super(color,filled,length,width);
		this.height = height;
	}
	public double volume() {
		return length * height * width;
	}
	public void setHeigth(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public String toString() {
		return super.toString()+"\nHeight : "+height+"\nVolume : "+volume();
	}
}
