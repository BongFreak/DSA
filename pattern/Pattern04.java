//5
//54321
//54321
//54321
//54321
//54321
package pattern;

import java.util.Scanner;

public class Pattern04 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) 
		{
			int j = 1;
			
			while(j<=n) 
			{	int p = n-j+1;
				System.out.print(p);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
