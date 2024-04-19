package Recursion;
import java.util.*;
public class SumOfArray 
{	public static int sum(int arr[]) 
	{
		return sum(arr,0);
	}
	public static int sum(int arr[], int n) //n = index
	{
		if(n == arr.length) 
		{
			return 0;
		}
		return arr[n]+sum(arr,n+1);
	}
	public static void main(String[] args) 
	{	
		int arr[] = {1,2,3,4};
		System.out.println(sum(arr));
	}

}
 