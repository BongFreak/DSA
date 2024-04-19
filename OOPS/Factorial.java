package OOPS;

public class Factorial {
	private int numerator;
	private int denominator;
	public Factorial(int numerator,int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	private void simplify() {
		int gcd =1;
		int small = Math.min(numerator, denominator);
		for(int i = 1; i<=small;i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
		
	}
	public void print() {
		System.out.println(numerator+"/"+denominator);
		
	}
	public void increment() {
		numerator = numerator + denominator;
		simplify();
		
	}
	public void add(Factorial f2) {
		this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
		
	}
	public static Factorial add(Factorial f1 ,Factorial f2) {
		int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
		int newDen = f1.denominator*f2.denominator;
		Factorial f3 = new Factorial(newNum,newDen);
		return f3;
	}
	

}
