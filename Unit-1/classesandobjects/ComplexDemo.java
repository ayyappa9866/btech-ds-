package classesandobjects;

public class ComplexDemo {

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(3.5,2.5);
		ComplexNumber c2 = new ComplexNumber(1.5,5.5);
		ComplexNumber sum = c2.add(c1);
		ComplexNumber sub = c2.sub(c1);
		ComplexNumber product = c2.mul(c1);
		System.out.println("Addition Result is : "+ sum.real+" + i"+sum.imaginary);
		System.out.println("Subtraction Result is : "+ sub.real+" + i"+sub.imaginary);
		System.out.println("Product Result is : "+ product.real+" + i"+product.imaginary);
	}

}
