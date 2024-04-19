//5
//55555
//4444
//333
//22
//1
package pattern;

import java.util.Scanner;

public class Pattern17_Reverse_NumberPattern {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) 
		{int j = 1;
		while(j<=n-i+1) 
		{
			System.out.print(n-i+1);		
			j++;
		}
		System.out.println();
		i++;
		}

	}
}
/* how many rows? = n
how many columns? = i is increasing and j is decreasing.
what to print? = i is increasing and the Number is decreasing also.
ex- In the 2nd row there are 3 numbers of the columns, so when n = 4 and 
i = 2, then number is (n-i+1) = 4-2+1 = 3 */

