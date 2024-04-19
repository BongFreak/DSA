package fundamentals;
import java.util.Scanner;
public class CheckPrimeNumber2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// Input number
		int n = sc.nextInt();
		// Do a for loop
		for (int div = 2; div <= n / 2; div++) 
		{
			if (n % div == 0) 
			{
				System.out.println("The number is not prime");
				return;
			}
		}
		System.out.println("The number is prime");
		
	}
}


