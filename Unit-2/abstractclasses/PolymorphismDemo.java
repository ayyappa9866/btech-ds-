package abstractclasses;

import java.util.ArrayList;
import java.util.List;
public class PolymorphismDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Triangle t1 = new Triangle();
		Square s1 = new Square();
//		c1.draw();
//		t1.draw();
//		s1.draw();
		List<Shape> l1 = new ArrayList<>();
		l1.add(c1);
		l1.add(t1);
		l1.add(s1);
		for(Shape sh:l1) {
			sh.draw();
		}
//		Shape s2 = new Circle();
	}
}
