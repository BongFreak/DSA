package Recursion;

import java.util.Scanner;

public class LCM {
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
		System.out.println("The LCM of Two Numbers is..."+(x*n)/gcd(x,n));// LCM = (a x b) / GCD of a ,b
		

	}

}
