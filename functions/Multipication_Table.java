package functions;

import java.util.Scanner;

public class Multipication_Table 
{
	public static void multipication_table(int n)
	{
		
		for(int i = 1; i<=10; i++) 
		{
			int m = n*i;
			System.out.println(n+" x "+i+" = "+m);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Input the Number...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		multipication_table(n);
		

	}

}
