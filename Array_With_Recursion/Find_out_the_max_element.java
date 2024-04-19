package Array_With_Recursion;

public class Find_out_the_max_element {
	public static int maxm(int[] arr , int idx) 
	{
		//base case
		if(idx==arr.length-1) return arr[idx];
		
		//small case --> from (idx+1) to (end of the array) calculate the max element--> recursive
		int smallcase = maxm(arr, idx+1);
		
		//self work
		return Math.max(arr[idx], smallcase);// compare idx+1 and idx
												//idx = current element
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,7};
	    System.out.println (maxm(arr, 0));

	}

}
