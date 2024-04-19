package practice;
import java.util.*;
public class Sum_OF_Digit 
{ 
	public static int sum(int n)
	{
		int s = 0;
		while(n>0)
		{
			int a = n%10;
			n=n/10;
			s+=a;
		}
		return s;
	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));
	}
		

	}


