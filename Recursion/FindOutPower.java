package Recursion;
import java.util.*;
public class FindOutPower 
//if x=2 and n=2 then base value 2^0 or 2^1
//x^n = x*x^(n-1)
{	public static int power(int x, int n) 
	{	//base case
		if(n==0) 
		{
			return 1;
		}
		//small case
		int sc = power(x,n-1);
		
		//Own Work
		int ans = sc*x; //recurrence rltn = x*power(x,n-1)
		
		return ans;
	}
	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the Number.....");
		int x = sc.nextInt();
		System.out.println("Input the Power.....");
		int n = sc.nextInt();
		System.out.println(power(x,n));
	}

}
 