package genericclasses;

public class GenericMultiple<K,V> {
	K key;
	V value;
	public void add(K key,V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public static void main(String[] args) {
		GenericMultiple<Integer,String> gm = new GenericMultiple<>();
		gm.add(10,"ABCD");
		System.out.println("Key : "+gm.getKey()+" Value : "+gm.getValue());
	}
}
