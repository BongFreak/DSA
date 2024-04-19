package functions;

import java.util.Scanner;

public class GCD {
	public static int gcd(int x, int y) {
		
		while(x%y!=0) {
			int rem = x%y;
			x=y;
			y=rem;
		}
		return y;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the Number.....");
		int x = sc.nextInt();
		System.out.println("Input the Power.....");
		int n = sc.nextInt();
		System.out.println(gcd(x,n));

	}

}
