package fundamentals;
import java.util.Scanner;
public class CheckPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// Input number
		int n = sc.nextInt();
		// Holds the count of values
		int count = 0;
		// There is no prime number less than 2.
		if (n <= 1) 
		{
			System.out.println("The number is not prime");
			return;
		}

		// Do a for loop
		for (int div = 1; div <= n / 2; div++) 
		{
			if (n % div == 0) 
			{
				count++;
			}
		}

		// If the number of factors is greater than 1,
		// the number is not prime.
		if (count > 1) 
		{
			System.out.println("The number is not prime");
		}
		else 
		{
			System.out.println("The number is prime");
		}
	}
}


