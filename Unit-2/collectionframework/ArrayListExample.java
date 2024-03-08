package collectionframework;
import java.util.ArrayList;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(50);
		arrList.add(60);
		arrList.add(70);
		arrList.add(80);
		arrList.add(90);
		arrList.add(100);
		arrList.add(110);
		arrList.add(0, 1000);
		System.out.println(arrList);
		System.out.println(arrList.size());
	}
}
