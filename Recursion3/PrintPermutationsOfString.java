package Recursion3;

import java.util.Scanner;

public class PrintPermutationsOfString {
	public static void permutation(String input) {
		permutationHelper(input.toCharArray(), 0);
	}
	public static void permutationHelper(char[]ar,int fi) {
		if (fi==ar.length-1) {
			System.out.println(ar);
			return;
		}
		for(int i=fi;i<ar.length;i++) {
			swap(ar,i,fi);
			permutationHelper(ar, fi+1);
			swap(ar,i,fi);
		}
	}
	public static void swap(char[]ar,int i,int fi) {
		char temp = ar[i];
		ar[i]=ar[fi];
		ar[fi]= temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String....");
		String s = sc.next();
		permutation(s);
		;
		
	}

}
