package practice;
import java.util.*;
public class Practice 
{ 
public static boolean isStringPalindrome(String input) {
		
		return (isStringPalindrome(input,0,input.length()-1));
	}
		
	
	public static boolean isStringPalindrome(String input, int si, int ei){
		if(si>=ei)return true;
		return ((input.charAt(si)==input.charAt(ei)) && isStringPalindrome(input,si+1,ei-1));
	}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println(isStringPalindrome(s));

}


}


