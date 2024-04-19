package String_with_Recursion;
import java.util.*;
//Remove 'a' from a String with out passing Index
public class Remove_Char_with_Recursion01 {
	public static String remove(String s) {
		//base case
		if(s.length()==0) return "";
		//small case
		String smallcase = remove(s.substring(1));
		//Self work
		char current = s.charAt(0);// current element is 0th Index
		if(current != 'a') {
			return current+smallcase;
		}
		else {
			return smallcase;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(remove(s));

	}

}
