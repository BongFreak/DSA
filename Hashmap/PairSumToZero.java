package Hashmap;

import java.util.HashMap;

public class PairSumToZero {
	public static int PairSum(int[]input,int size) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int current_element :input) {
			int complement = -current_element;
			if (map.containsKey(complement)) {
				count = count+map.get(complement);
			}
			map.put(current_element, map.getOrDefault(current_element, 0)+1);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {2,1,-2,2,3};
		int size = 5;
		System.out.println(PairSum(arr, size));
	}

}
