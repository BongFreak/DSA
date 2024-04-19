package functions;
import java.util.*;
public class Varargs01 
{	//Over loading Method
//	public static int sum(int a , int b) 
//	{	
//		return a+b;
//	}
//	public static int sum(int a, int b, int c) 
//	{	
//		return a+b+c;
//	}
//	public static int sum(int a, int b, int c, int d) 
//	{	
//		return a+b+c+d;
//	}
	//Variable Argument (Varargs)
	public static int sum(int...arr)
	{
		int result = 0;
		for(int e:arr) 
		{
			result+=e;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println("The sum of Nothing is... "+sum());
		System.out.println("The sum of 4 and 5 is... "+sum(4,5));
		System.out.println("The sum of 4 , 5 and 6 is... "+sum(4,5,6));
		System.out.println("The sum of 4 , 5 , 6 and 7 is... "+sum(4,5,6,7));
	}
}
