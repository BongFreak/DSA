package String_with_Recursion;
import java.util.*;
public class Remove_Char_without_Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ans="";
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)!='a') ans+= s.charAt(i);
		}
		System.out.println(ans);

	}

}
