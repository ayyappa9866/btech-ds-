package classesandobjects;

public class ComplexNumber {
	public double real;
	public double imaginary;
	public ComplexNumber(double real,double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public ComplexNumber() {
		
	}
	public ComplexNumber add(ComplexNumber c3) {
		ComplexNumber res = new ComplexNumber();
		res.real = this.real + c3.real;
		res.imaginary = this.imaginary + c3.imaginary;
		return res;
	}
//	public ComplexNumber add(ComplexNumber c1,ComplexNumber c2) {
//		ComplexNumber res = new ComplexNumber();
//		res.real = c2.real + c1.real;
//		res.imaginary = c2.imaginary + c1.imaginary;
//		return res;
//	}
	public ComplexNumber sub(ComplexNumber c3) {
		ComplexNumber res = new ComplexNumber();
		res.real = this.real - c3.real;
		res.imaginary = this.imaginary - c3.imaginary;
		return res;
	}
	public ComplexNumber mul(ComplexNumber c3) {
		ComplexNumber res = new ComplexNumber();
		res.real = ((this.real * c3.real) - (this.imaginary * c3.imaginary));
		res.imaginary = (this.real * c3.imaginary) + (this.imaginary * c3.real);
		return res;
	}
	
}
