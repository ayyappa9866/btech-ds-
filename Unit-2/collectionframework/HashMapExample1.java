package collectionframework;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(102, "ABCD");
		hm.put(108, "PQRS");
		hm.put(101, "CDEF");
		System.out.println(hm);
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.print(m.getKey()+" "+m.getValue());
			System.out.println();
		}
	}
}
