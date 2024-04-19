package OOPS;

import java.util.Arrays;

public class DynamicArray {
	private int[] arr = new int[2];
	 int idx;
	 int size;

	public void add(int ele) {
		if(size==arr.length) {
			int[] brr = Arrays.copyOf(arr,arr.length*2);
			arr=brr;
		}
		arr[idx] = ele;
		idx++;
		size++;
		
	}
	

	

}
