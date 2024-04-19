package Exception;
import java.util.*;
public class ExceptionDemo {
	public static int divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException();
		}
		return a/b;
	}

	public static void main(String[] args) {
		System.out.println(divide(4,0));

	}

}
