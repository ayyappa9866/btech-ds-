package genericclasses;

public class GenericBound<T extends Number> {
	T value;
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public static void main(String[] args) {
		GenericBound<Integer> gb = new GenericBound<>();
		gb.setValue(10);
		System.out.println(gb.getValue());
	}
}
