package Recursion3;

public class Return_Subsequences {
	public static String[] Subsequences(String word) {
		if (word.length()==0) {
			String[] output = new String[1];
			output[0]="";
			return output;
		}
		String[] smalloutput = Subsequences(word.substring(1));
		String[] output = new String[smalloutput.length*2];
		for(int i=0;i<smalloutput.length;i++) {
			output[i] = smalloutput[i];
		}
		for(int i=0;i<smalloutput.length;i++) {
			output[smalloutput.length+i]= word.charAt(0)+smalloutput[i];
		}
		return output;
	}

	public static void main(String[] args) {
		String[] outStrings = Subsequences("abc");
		for(String outputString :outStrings) {
			System.out.println(outputString);
		}
	}

}
