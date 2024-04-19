package Hashmap;

import java.util.*;

public class LongestConsecutiveSequence {
	public static ArrayList<Integer> ConsecutiveSequence(int[]arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int element:arr) {
			map.put(element, true);
			if (map.containsKey(element-1)) {
				map.put(element, false);
			}
		}
		int maxLength = 0;
		int maxStart = 0;
		
		for(int val :arr) {
			if (map.get(val)==true) {
				int tempLength = 1;
				int tempStart = val;
				while(map.containsKey(tempStart+tempLength)) {
					tempLength++;
				}
				if (tempLength>maxLength) {
					maxLength = tempLength;
					maxStart = tempStart;
					
				}
			}
			
		}
//		for(int i =0;i<maxLength;i++) {
//			System.out.println(maxLength+i);
//		}
		 int maxEnd = (maxStart+maxLength)-1;
		 ArrayList<Integer>sequenceArrayList = new ArrayList<>();
		sequenceArrayList.add(maxStart);
		sequenceArrayList.add(maxEnd);

		return sequenceArrayList;
		
		
	}

	public static void main(String[] args) {
		int[]arr = {10,5,9,1,11,8,6,15,3,12,2};
		System.out.print(ConsecutiveSequence(arr));

	}

}
