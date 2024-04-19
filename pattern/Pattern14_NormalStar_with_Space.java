//5
//    *
//   **
//  ***
// ****
//*****

package pattern;

import java.util.Scanner;

public class Pattern14_NormalStar_with_Space {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{	
			int sp = 1; 
										//	sp=space, Number of Input = (Space + ith Row)
			while(sp<=n-i) 
			{
				System.out.print(' ');
				sp++;								
			}

			int star = 1;
			while(star<=i)
			{
				System.out.print("*");
				star++;
			}
			System.out.println();
			i++;
		}

	}
}


