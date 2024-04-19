package Recursion;

import java.util.Scanner;

public class GCD {
	public static int gcd(int x, int y) {
		//base work
		if(y==0)return x;
		
		//Euclid's Algo
		//gcd(x,y) = gcd (y,x % y)
		//gcd(x,0) = x; --> base case
		
		return gcd(y,x%y);
		
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
