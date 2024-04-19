package Recursion3;

public class Return_Keypad {
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
	public static String[] keypad(int n) {
		if (n==0||n==1) {
			String[] output = {""};
			return output;
		}
		String[] smalloutput = keypad(n/10);
		int lastdigit = n%10;
		String lastDigitCharacter = getOption(lastdigit);
		String[] output = new String[smalloutput.length*lastDigitCharacter.length()];//mention the array size
		int k=0;
		for(int i = 0;i<smalloutput.length;i++) {
			for(int j=0;j<lastDigitCharacter.length();j++) {
				output[k] = smalloutput[i]+lastDigitCharacter.charAt(j);
				k++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] outputStrings = keypad(23);
		for(String output:outputStrings) {
			System.out.println(output);
		}

	}

}
