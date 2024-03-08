package collectionframework;
import java.util.LinkedList;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<>();
		lList.add("Veltech");
		lList.add("XYZ");
		lList.add("PQR");
		lList.addFirst("ABC");
		System.out.println(lList.size());
		System.out.println(lList.getFirst());
		System.out.println(lList.getLast());
		System.out.println(lList);
	}
}
