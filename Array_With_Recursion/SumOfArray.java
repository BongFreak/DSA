package Array_With_Recursion;
import java.util.*;
public class SumOfArray 
{	public static int sum(int arr[]) 
	{
		return sum(arr,0);
	}
	public static int sum(int arr[], int idx) //idx = index, arr[idx]= the current element of current index
	{	//base Case no 1
		//if(idx == arr.length-1) return arr[idx];// when we reach at the last index of a element, then there is no remaining element
												// so it return itself
		//base Case no 2
		if(idx == arr.length) return 0;// when empty array is created, then there is no sum 
									   // so idx == 0 and arr.length == 0 bcz there is no element so it return 0.
		//small case
		int smallcase = sum(arr,idx+1);
		
		//self work
		return arr[idx]+smallcase;
	}
	public static void main(String[] args) 
	{	
		int arr[] = {1,2,3,4};
		System.out.println(sum(arr));
	}

}
 