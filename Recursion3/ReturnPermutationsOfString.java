package Recursion3;

import java.util.*;

public class ReturnPermutationsOfString {
	public static String[] permutation(String input) {
		ArrayList<String>ans = new ArrayList<>();
		permutationHelper(input.toCharArray(), 0,input.length()-1,ans);
		return ans.toArray(new String[0]);
	}
	public static void permutationHelper(char[]ar,int l,int r,ArrayList<String>ans) {
		if (l==r) {
			ans.add(new String(ar));
		}
		for(int i=l;i<=r;i++) {
			swap(ar,i,l);
			permutationHelper(ar, l+1,r,ans);
			swap(ar,i,l);
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
