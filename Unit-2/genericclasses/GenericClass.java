package genericclasses;
public class GenericClass<T> {
	T value;
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public static void main(String[] args) {
		GenericClass<String> gc = new GenericClass<>();
		gc.setValue("ABCD");
//		gc.setValue("PQRS");
//		gc.setValue("XYZ");
		System.out.println(gc.getValue());
		GenericClass<Integer> gi = new GenericClass<>();
		gi.setValue(10);
		System.out.println(gi.getValue());
	}
}
