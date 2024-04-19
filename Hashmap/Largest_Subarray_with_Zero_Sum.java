package Hashmap;

import java.util.HashMap;

public class Largest_Subarray_with_Zero_Sum {
	public static int largestSubarray(int[]arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxlength=0;
		int sum = 0;
		map.put(sum, -1);
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if (map.containsKey(sum)==false) {
				map.put(sum, i);
			}else {
				int previousIndex = map.get(sum);
				int currentIndex = i;
				int length = currentIndex-previousIndex;
				if (length>maxlength) {
					maxlength = length;
				}
			}
			
		}
		return maxlength;
	}

	public static void main(String[] args) {
		int[] arr = {95,-97,-387,-435,-5,-70,897,127,23,284};
		System.out.println(largestSubarray(arr));
		
		
		
	}
}
