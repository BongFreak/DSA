package practice;
import java.util.*;
public class Count_The_Number_Of_Digit_using_Count 
{ 
	public static int dig(int n) 
	{
		int count = 0;
		while(n>0) // suppose n = 12356
		{
			n=n/10; // n = 12356/10
					// n = 1235 (10 diye divide kore "n" update holo)
			count++; // jotobar divide hbe totobar "count" barbe
		}
		return count;
	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		System.out.println(dig(n));

	}

}
