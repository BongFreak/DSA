package Recursion;
import java.util.*;
public class NumberOfDigit 

{	public static int count(int n) 
	{	//Base case
		if(n>=0 && n<=9) 
		{
			return 1;
		}
		
		//small case
		int sc = count(n/10);
		
		//self work
		int ans = sc+1;	//recurrence relation = 1+count(n/10)
		
		return ans;
	}
	
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the Number.....");
		int x = sc.nextInt();
		
		System.out.println(count(x));
	}

}
 