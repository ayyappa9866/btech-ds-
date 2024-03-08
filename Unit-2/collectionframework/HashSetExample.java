package collectionframework;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Long> hs = new HashSet<>();
		hs.add(10L);
		hs.add(15L);
		hs.add(12L);
		hs.add(5L);
		hs.add(100L);
		hs.add(11L);
		hs.add(13L);
		hs.add(3L);
		System.out.println(hs);
		for(Long item:hs) {
			System.out.print(item+" ");
		}
		System.out.println();
		Iterator<Long> it1 = hs.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		hs.remove(5L);
		System.out.println(hs);
	}
}
