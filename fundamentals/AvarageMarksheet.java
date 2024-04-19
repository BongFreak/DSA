package fundamentals;
import java.util.Scanner;

public class AvarageMarksheet {

	public static void main(String[] args) 
	{ int m1, m2, m3, avg;
	
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(0);
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		avg = (m1 + m2 + m3)/3;
		System.out.println(ch);
		System.out.println(avg);
		



	}

}
