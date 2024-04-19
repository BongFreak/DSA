package String_with_Recursion;

public class Replace_Two_character {
	public static String replace(String s,char a, char b, int idx) { //replace char 'a' to char'b'
		if(idx==s.length()) return "";
		String smallcase = replace(s,a,b,idx+1);
		char current = s.charAt(idx);
		if(current!=a) {
			return current+smallcase;
		}
		else {
			return b+smallcase;
		}
	}
	public static void main(String[] args) {
		System.out.println(replace("axgbnaxx",'x','y',0));
	}

}
