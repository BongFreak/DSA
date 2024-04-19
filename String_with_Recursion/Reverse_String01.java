package String_with_Recursion;
//Reverse a String with out passing Index
import java.util.Scanner;

public class Reverse_String01 {
	public static String reverse(String s) {
		//base case
		if(s.length()==0) return "";
		//small case
		String smallcase = reverse(s.substring(1));
		char current = s.charAt(0);
		return smallcase+current;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverse(s));


	}

}
