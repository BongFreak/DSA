//5
//ABCDE
//ABCDE
//ABCDE
//ABCDE
//ABCDE

package pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) 
		{
			int j = 1;
			
			while(j<=n) 
			{	
				System.out.print((char)('A'+j-1));
				j++;
				
			}
			System.out.println();
			i++;
		}

	}

}
