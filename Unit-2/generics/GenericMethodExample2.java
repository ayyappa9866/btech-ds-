package generics;
public class GenericMethodExample2 {
	public static <T> int linearSearch(T[] arr,T search) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == search) {
				return i;
			}
		}	
		return -1;
	}
	public static void main(String[] args) {
		Integer[] a1 = {1,56,3,89,2,5};
		String[] s1 = {"ABC","CDE","EFG","PQR"};
		int index = linearSearch(s1,"PQR");
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Element Found at "+index+" th index");
		}
	}

}
