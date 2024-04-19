package functions;
import java.util.Scanner;

public class CheckPrimeNumber 
{
	public static boolean checkprime(int n) 
	{
		for(int div=2;div<=n/2;div++) 
		{
			if(n%div==0) 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkprime(n));
		
	}

}
