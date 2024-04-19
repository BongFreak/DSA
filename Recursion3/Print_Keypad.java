package Recursion3;

import java.util.Scanner;

public class Print_Keypad {
	public static String getOption(int digt) {
		if (digt==2) {
			return"abc";
		}
		if (digt==3) {
			return"def";
		}
		if (digt==4) {
			return"ghi";
		}
		if (digt==5) {
			return"jkl";
		}
		if (digt==6) {
			return"mno";
		}
		if (digt==7) {
			return"pqrs";
		}
		if (digt==8) {
			return"tuv";
		}
		if (digt==9) {
			return"wxyz";
		}
		return"";
	}
	public static void printKeypad(int input,String stringSoFar) {
		if (input==0) {
			System.out.println(stringSoFar);
			return;
		}
		int lastdigit = input%10;
		int smallInput = input/10;
		String option_lastdigit = getOption(lastdigit);
		for(int i = 0;i<option_lastdigit.length();i++) {
			printKeypad(smallInput, option_lastdigit.charAt(i)+stringSoFar);
		}
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number....");
		int input = sc.nextInt();
		printKeypad(input, "");
	}

}
