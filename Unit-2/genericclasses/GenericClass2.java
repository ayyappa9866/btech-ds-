package genericclasses;
@SuppressWarnings("unchecked")
public class GenericClass2<T> {
	int count = 0;
	T[] data = (T[])new Object[10];
	public void add(T value) {
		data[count] = value;
		count++;
	}
	public void display() {
		for(int i = 0;i < count;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		GenericClass2<String> gc = new GenericClass2<>();
		gc.add("ABCD");
		gc.add("PQRS");
		gc.add("XYZ");
		gc.display();
		
	}
}
