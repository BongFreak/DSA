package String_with_Recursion;
import java.util.*;
public class Remove_Char_with_Recursion {
	public static String remove(String s,int idx) {
		//base case
		if(idx==s.length()) return "";//empty string
		//small case
		String smallcase = remove(s,idx+1);
		//self work
		char current = s.charAt(idx);//current index
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
		System.out.println(remove(s,0));

	}

}
