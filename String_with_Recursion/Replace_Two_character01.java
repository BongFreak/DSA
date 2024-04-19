package String_with_Recursion;

public class Replace_Two_character01 {
	public static String replace(String s,char a, char b) { //replace char 'a' to char'b'
		if(s.length()==0) return "";
		String smallcase = replace(s.substring(1),a,b);
		char current = s.charAt(0);
		if(current!=a) {
			return current+smallcase;
		}
		else {
			return b+smallcase;
		}
	}
	public static void main(String[] args) {
		System.out.println(replace("axgbnaxx",'x','y'));
	}

}
