package Recursion;
import java.util.*;
public class Array_Is_Sorted_or_Not 
{	
	public static boolean isSorted(int arr[])
	{
		if(arr.length==1) 
		{
			return true;
		}
		if(arr[0]>arr[1]) 
		{
			return false;
		}
		int smallArray[]= new int[arr.length-1];
		for(int i = 0;i>arr.length;i++) 
		{
			smallArray[i-1] = arr[i];
		}
		return isSorted(smallArray);
	}
	public static void main(String[] args) 
	{	
		int arr[] = {1,2,3,4};
		System.out.println(isSorted(arr));
		
	}

}
 