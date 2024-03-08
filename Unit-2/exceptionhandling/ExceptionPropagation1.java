package exceptionhandling;
public class ExceptionPropagation1 {
	public void A() {
		B();
		System.out.println("I am in method A");
	}
	public void B() {
		C();
		System.out.println("I am in method B");
	}
	public void C() {
		D();
		System.out.println("I am in method C");
	}
	public void D() {
		int data = 50 / 0;
		System.out.println("I am in method D");
	}
	public static void main(String[] args) {
		ExceptionPropagation1 e1 = new ExceptionPropagation1();
		try {
			e1.A();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("I am in method Main");
	}
}