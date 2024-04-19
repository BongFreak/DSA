package Recursion;
import java.util.*;
public class Practice 
{	
	public static boolean isshorted(int arr[]) 
	{
		if(arr.length==1) 
		{
			return true;
		}
		if(arr[0]>arr[1]) 
		{
			return false;
		}
		int smallarr[]= new int[arr.length - 1];
		for(int i = 0;i>arr.length;i++) 
		{
			smallarr[i-1] = arr[i];
		}
		return isshorted(smallarr);
	}
	public static void main(String[] args) 
	{	
		int arr[] = {1,2,3,4};
		System.out.println(isshorted(arr));
		
	}

}
 