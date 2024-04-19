package Hashmap;

import java.util.HashMap;

public class PairWIthDifference_K {
	public static int getPairsWithDifferenceK(int[]arr,int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int element : arr) {
			map.put(element, map.getOrDefault(element, 0)+1);
		}
		for(int element : arr) {
			int plus = element+k;
			int minus = element-k;
			if (k!=0) {
				if (map.containsKey(plus)) {
					count+= map.get(element)*map.get(plus);
					map.put(element, 0);
				}
				if (map.containsKey(minus)) {
					count+= map.get(element)*map.get(minus);
					map.put(element, 0);
				}
			}else { //k==0
				count+= (map.get(element)*(map.get(element)-1))/2;
				map.put(element, 0);
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		int[] arr = {4,4,4,4};
		System.out.println(getPairsWithDifferenceK(arr, 0));

	}

}
