//5
//    1
//   121
//  12321
// 1234321
//123454321
package pattern;

import java.util.Scanner;

public class Pattern18_TriangeOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) 
		{
			int sp = 1;
			while(sp<=n-i)
			{
				System.out.print(' ');	
				sp++;										
			}
			int inc = 1;
			while(inc<=i)
			{
				System.out.print(inc);
				inc++;
			}
			int dec = i-1;
			while(dec>=1)	//dec>=1 because i need minimum one decrement.
			{
				System.out.print(dec);
				dec--;
			}
			System.out.println();
			i++;
		}


	}
}
/*	n=4			
	1
   12			1
  123			21
 1234			321
1st_part	  2nd_part

1st create space, (1st_part)
2nd do increase from 1 to i, (1st_part)

3rd do decrease from i-1 to 1 (2nd_part)
ex- i = 2 & then i-1 = 2-1 = 1	
i = 1 & then i-1 = 1-1 = 0	*/

