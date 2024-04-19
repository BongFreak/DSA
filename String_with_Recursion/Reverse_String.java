package String_with_Recursion;

import java.util.Scanner;

public class Reverse_String {
	public static String reverse(String s, int idx) {
		//base case
		if(idx==s.length()) return "";
		//small case
		String smallcase = reverse(s,idx+1);
		char current = s.charAt(idx);
		return smallcase+current;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverse(s,0));


	}

}
