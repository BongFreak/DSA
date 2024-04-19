package Hashmap;
import java.util.*;
public class Print_Intersection {
	public static void intrc(int [] arr1,int[] arr2) {
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if (map.containsKey(arr1[i])==false) {
				map.put(arr1[i], 1);
			} else {
				int value = map.get(arr1[i]);
				map.put(arr1[i], value+1);
			}
		}
		for(int i=0;i<arr2.length;i++ ) {
			if (map.containsKey(arr2[i])==true) {
				int frq = map.get(arr2[i]);
				if (frq>0) {
					System.out.print(arr2[i]+" ");
					map.put(arr2[i], frq-1);
				}
			}
		}
	}
public static void main(String[] args) {
	int [] arr1 = {6,9,8,5};
	int[] arr2 = {9,2,4,1,8};
	intrc(arr1, arr2);
}
}
