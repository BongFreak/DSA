//5
//*
//*1*
//*121*
//*12321*
//*1234321*
//*123454321*
//*1234321*
//*12321*
//*121*
//*1*
//*

package pattern;
import java.util.Scanner;
public class Pattern26_HalfDiamond {

	public static void main(String[] args) 
	{
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("*");
		for (int i = 1; i <= n; i++) 
		{
			int j = 1;
			System.out.print("*");
			while (j <= i)
			{
				System.out.print(j);
				j++;
			}
			j--;
			while (--j >= 1)
			{
				System.out.print(j );
			}
			System.out.println("*");
		}
		for (int i = n - 1; i >= 1; i--) 
		{
			int j = 1;
			System.out.print("*");
			while (j <= i) {
				System.out.print(j);
				j++;
			}
			j--;
			while (--j >= 1) 
			{
				System.out.print(j );
			}
			System.out.println("*");
		}
		System.out.println("*");

	}

}


