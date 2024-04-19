//5
//    1
//   232
//  34543
// 4567654
//567898765
package pattern;
import java.util.Scanner;

public class Pattern20_TriangleOf_Increase_Decrease_Numbe {

	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i =1;
	while(i<=n) 
	{	
		int sp=1;
		while(sp<=n-i) 
		{
			System.out.print(' ');
			sp++;

		}
		int inc=1;
		int k = i; 					/* "k" for from where it will be increased.Ex- when i is 3 then it started from 3
																				when i is 4 then it started from 4 */
		while(inc<=i) 
		{
			System.out.print(k);
			inc++;
			k++;


		}
		int dec=i-1;
		int q = k-2;				/* "q" for from where it will be decreased. Ex- when k is 8(after increasing k++)
		 																		then it started from k-2=6 */
		while(dec>=1) 
		{
			System.out.print(q);
			dec--;
			q--;
		}
		System.out.println();
		i++;

	}
	}





}


