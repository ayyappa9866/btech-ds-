package generics;
public class GenericMethodExample3 {
	public static <T extends Comparable<T>> T maximum(T[] arr) {
		T maxValue = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i].compareTo(maxValue)> 0) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	public static void main(String[] args) {		
		Integer[] a1 = {10,20,5,3,1,2};
		System.out.println(maximum(a1));
	}
}
