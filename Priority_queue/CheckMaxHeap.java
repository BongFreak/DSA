package Priority_queue;

public class CheckMaxHeap {
	public static boolean checkMax(int[]arr) {
		return checkMaxHelper(arr, 0);
	}
	public static boolean checkMaxHelper(int[]arr,int startIndex) {
		if (startIndex==arr.length) {
			return true;
		}
		int parentIndex = startIndex;
		int leftChildIndex = 2*parentIndex+1, rightChildIndex = 2*parentIndex+2;
		boolean leftans = true, rightans = true;
		if (leftChildIndex<arr.length) {
			if (arr[leftChildIndex]>arr[parentIndex]) {
				return false;
			}else {
				leftans=checkMaxHelper(arr, leftChildIndex);
			}
		}
		if (rightChildIndex<arr.length) {
			if (arr[rightChildIndex]>arr[parentIndex]) {
				return false;
			}else {
				rightans=checkMaxHelper(arr, rightChildIndex);
			}
		}
		return (leftans && rightans);
	}

	public static void main(String[] args) {
		int[] arr = {42,20,18,6,14,11,9,4};
	System.out.println(checkMax(arr)); 
	}

}
