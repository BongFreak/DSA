package OOPS;

public class FactorialUser {

	public static void main(String[] args) {
		Factorial f1 = new Factorial(4,2);
		Factorial f2 = new Factorial(6,8);
		Factorial f3 = Factorial.add(f1,f2);
		f1.print();
		f2.print();
		f3.print();
//		f1.increment();
//		f1.print();
//		f1.add(f2);
//		f1.print();
	}

}
