package Recursion;

public class First_Index_Of_a_Number_in_an_Array 
{
	public static int check(int arr[],int x) //x=target
	{
		return check(arr,x,0);
	}
	public static int check(int arr[],int x,int n) //n = index number
	{
		if(arr.length == n) 
		{
			return -1;
		}
		if(arr[n]==x) 
		{
			return n;
		}
		return check(arr,x,n+1);
	}

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4};
		System.out.println(check(arr,4));

	}

}
