//5
//*****
//****
//***
//**
//*
package pattern;

import java.util.Scanner;

public class Pattern16_Reverse_StarPattern {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) 
		{
			int j = 1;
			while(j<=(n-i)+1) 								
			{
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}

	}
}
/* how many rows? = n
how many columns? = i is increasing and j is decreasing.
what to print? = " * "
ex- In the 2nd row there are 4 numbers of the columns, so when n = 5 and 
i = 2, then j = ((5-2)+1) = 4stars */

