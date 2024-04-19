package Recursion3;

public class PrintSubsequences {
	public static void printsub(String input, String stringSoFar) {
		if (input.length()==0) {
			System.out.println(stringSoFar);
			return;
		}
		String smallinput = input.substring(1);
		printsub(smallinput, stringSoFar);
		printsub(smallinput, stringSoFar+input.charAt(0));
	}

	public static void main(String[] args) {
		String aString = "abc";
		printsub(aString, "");
	}

}
