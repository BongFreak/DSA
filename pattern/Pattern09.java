//5
//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1 

package pattern;

import java.util.Scanner;

public class Pattern09 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) 
		{
			int j = 1;
			
			while(j<=i) 
			{	
				System.out.print((i-j+1)+" ");
				j++;
				
			
			}
			System.out.println();
			i++;
		}

	}

}
