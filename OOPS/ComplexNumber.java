package OOPS;

public class ComplexNumber {
		private int Real;
		private int Imaginary;
		
	public ComplexNumber(int Real, int Imaginary) {
		this.Real=Real;
		this.Imaginary=Imaginary;
	}

	public void print() {
		System.out.println(this.Real+" + i"+this.Imaginary);
		
	}

	public void setReal(int Real) {
		this.Real=Real;
	}
	public void setImaginary(int Imaginary) {
		this.Imaginary=Imaginary;
	}

	public void add(ComplexNumber c2) {
		this.Real = this.Real+c2.Real;
		this.Imaginary = this.Imaginary+c2.Imaginary;
		
	}

	public void multiply(ComplexNumber c2) {
		int newReal = this.Real*c2.Real - this.Imaginary*c2.Imaginary;
		
		int newImaginary = this.Real*c2.Imaginary + this.Imaginary*c2.Real;
		this.Real = newReal ;
		this.Imaginary = newImaginary;
		
	}

	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int newReal = c1.Real+c2.Real;
		int newImaginary = c1.Imaginary+c2.Imaginary;
		ComplexNumber c4 = new ComplexNumber(newReal,newImaginary);
		return c4;
	}
}

	


