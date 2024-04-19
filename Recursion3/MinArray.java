package Recursion3;

public class MinArray {
	public static int findMin(int[]arr,int startIndex) {
		if (startIndex == arr.length) {
			return Integer.MAX_VALUE;
		}
		int minSmallArray = findMin(arr, startIndex+1);
		if (arr[startIndex]<minSmallArray) {
			return arr[startIndex];
		}else {
			return minSmallArray;
		}
	}
	public static void printMin(int[]arr,int startIndex,int minSoFar) {
		if (startIndex==arr.length) {
			System.out.println(minSoFar);
			return;
		}
		int newmin = minSoFar;
		if (arr[startIndex]<minSoFar) {
			newmin = arr[startIndex];
		}
		printMin(arr, startIndex+1, newmin);
	}

	public static void main(String[] args) {
		int[] a = {3,4,2,1,7,8};
		printMin(a, 0, Integer.MAX_VALUE);
//		int min = findMin(a, 0);
//		System.out.println(min);
	}

}
