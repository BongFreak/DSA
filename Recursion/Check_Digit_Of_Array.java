package Recursion;
import java.util.*;
public class Check_Digit_Of_Array 
{	public static boolean check(int arr[],int t)//t = target 
	{
		return check(arr,t,0);
	}
	public static boolean check(int arr[], int t,int n) //n = index
	{
		if(n == arr.length) 		//Base Case
		{
			return false;
		}
		if(arr[n]==t) 			//checking the target digit is available in current index.
		{
			return true;
		}
		return check(arr,t,n+1);	
	}
	public static void main(String[] args) 
	{	
		int arr[] = {1,2,3,4};
		System.out.println(check(arr,4));
	}

}
 