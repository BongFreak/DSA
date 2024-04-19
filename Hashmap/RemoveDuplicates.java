package Hashmap;

import java.util.*;

public class RemoveDuplicates {
public static ArrayList<Integer> removeDuplicates(int[]arr) {
	HashMap<Integer, Boolean>map = new HashMap<>();
	ArrayList<Integer>arrayList = new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		if (map.containsKey(arr[i])==false) {
			map.put(arr[i], true);
			arrayList.add(arr[i]);
		}else {
			continue;
		}
	}
	return arrayList;
}
	public static void main(String[] args) {
		int[]arr = {1,3,2,2,3,1,6,2,5};
		ArrayList<Integer>output = removeDuplicates(arr);
		System.out.print(output);

	}

}
