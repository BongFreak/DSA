package Recursion;
import java.util.*;
public class Fibonacci_Number 
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
// formula of Fibonacci is = f(n) = f(n-1)+f(n-2)
{	
	public static int fab(int n) 
	{
//		if(n==1) // Long Process
//		{
//			return 0;
//		}
//		else if(n==2) 
//		{
//			return 1;
//		}
		if(n==1 || n==2) // Short Process
		{
			return (n-1);
		}
		return fab(n-1)+fab(n-2);
	}
	
	public static void main(String[] args) 
	{	
		int n = 7;
		System.out.println(fab(n));
	}

}
 