package collectionframework;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Long> ts = new TreeSet<>();
		ts.add(10L);
		ts.add(15L);
		ts.add(12L);
		ts.add(5L);
		ts.add(100L);
		ts.add(11L);
		ts.add(13L);
		ts.add(3L);
		System.out.println(ts);
		for(Long item:ts) {
			System.out.print(item+" ");
		}
		System.out.println();
		Iterator<Long> it1 = ts.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		ts.remove(5L);
		System.out.println(ts);
	}

}
