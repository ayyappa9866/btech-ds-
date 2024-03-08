package exceptionhandling;
import java.io.IOException;
public class ExceptionPropagationExample2 {

	public void A()throws IOException {
		B();
		System.out.println("I am in method A");
	}
	public void B()throws IOException {
		C();
		System.out.println("I am in method B");
	}
	public void C()throws IOException {
		D();
		System.out.println("I am in method C");
	}
	public void D()throws IOException {
		throw new IOException("IO Error");
		
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
