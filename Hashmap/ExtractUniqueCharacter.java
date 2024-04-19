package Hashmap;

import java.util.*;

public class ExtractUniqueCharacter {
	public static String removeDuplicates(String str) {
		HashMap<Character, Boolean>map = new HashMap<>();
		String st = "";
		for(int i=0;i<str.length();i++) {
			if (map.containsKey(str.charAt(i))==false) {
				map.put(str.charAt(i), true);
//				arrayList.add(arr[i]);
				st=st+str.charAt(i);
			}else {
				continue;
			}
		}
		return st;
	}

	public static void main(String[] args) {
		String string = "ababacd";
		System.out.println(removeDuplicates(string));
	}

}
