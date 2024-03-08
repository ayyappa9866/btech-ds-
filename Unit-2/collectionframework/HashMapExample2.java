package collectionframework;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class HashMapExample2 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Numbers (End -1) ");
		while(true) {
			int a = input.nextInt();
			if(a == -1) {
				break;
			}else {
				if(hm.containsKey(a)) {
					int value = hm.get(a);
					hm.put(a, value + 1);
				}else {
					hm.put(a, 1);
				}
			}	
		}
		System.out.println(hm);
		for(Entry<Integer, Integer> m:hm.entrySet()) {
			System.out.print(m.getKey()+"--->"+m.getValue());
			System.out.println();
		}
		input.close();
	}
}
