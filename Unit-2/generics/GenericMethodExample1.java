package generics;
public class GenericMethodExample1 {
	public static <T> void display(T[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {

		Integer[] a1 = {10,5,2,15,1,6};
		display(a1);
		String[] s1 = {"ABC","CDE","DEF"};
		display(s1);
		
		
		
		
		
		//		ArrayList a1 = new ArrayList();
//		a1.add(10);
//		a1.add("Ayyappa");
//		System.out.println((Integer)a1.get(0));
//		System.out.println(a1.get(1));
////		ArrayList<Integer> a2 = new ArrayList<>();
////		a2.add(20);
////		a2.add("Ayyappa");

	}

}
