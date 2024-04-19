package Hashmap;

import java.util.HashMap;

public class CheckFrequency {
//	public static String check(char[] arr) {
//		String str = " ";
//		HashMap<Character, Boolean> map = new HashMap<>();
//		for(int i=0 ;i<arr.length;i++) {
//			char ch = arr[i];
//			if (map.containsKey(ch)) {
//				str += ch;
//				map.put(ch, true);
//			}
//		}
//		return str;
//	}
	public static String check(String st) {
		String str = " ";
		HashMap<Character, Boolean> map = new HashMap<>();
		for(int i=0 ;i<st.length();i++) {
			char ch = st.charAt(i);
			if (map.containsKey(ch)) {
				str += ch;
				map.put(ch, true);
			}
		}
		return str;
	}

	public static void main(String[] args) {
//		char[] arr = {'a','b','b','c','d','e','c','d'};
//		System.out.print(check(arr));
		String string = "codingninjashere";
		System.out.println(check(string));
		
		
	}

}
