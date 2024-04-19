package functions;

import java.util.Scanner;

public class Reverse_Star_Pattern 
{
	public static void star(int n) 
	{
		for(int i = 1;i<=n;i++) 
		{
			for(int j =1; j<=(n-i+1);j++) 
			{
				System.out.print("* ");
			}
				System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Input number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		star(n);

	}

}
