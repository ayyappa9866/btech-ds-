package collectionframework;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Long> lhs = new LinkedHashSet<>();
		lhs.add(10L);
		lhs.add(15L);
		lhs.add(12L);
		lhs.add(5L);
		lhs.add(100L);
		lhs.add(11L);
		lhs.add(13L);
		lhs.add(3L);
//		lhs.addFirst(150l);
		System.out.println(lhs);
		for(Long item:lhs) {
			System.out.print(item+" ");
		}
		System.out.println();
		Iterator<Long> it1 = lhs.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		lhs.remove(5L);
		System.out.println(lhs);
	}

}
