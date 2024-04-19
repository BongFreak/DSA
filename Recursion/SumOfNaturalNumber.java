package Recursion;
import java.util.*;
public class SumOfNaturalNumber 
//suppose int n = 4
//sum(n) = n + sum(n-1)
//sum(4) = 4 + sum(3)
//		 = 4 + 3 + sum(2)
//		 = 4 + 3 + 2 + sum(1)
//		 = 4 + 3 + 2 + 1
{	public static int sum(int n) // n = 4
	{	//Base Case
		if(n==0) 
		{
			return 0;
		}
		//Small Case
		int smallcase = sum(n-1);
		
		//Self Work
		int ans = smallcase+n;	//recurrence relation = sum(n-1)+n
		
		return ans;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(sum(4));
	}

}
