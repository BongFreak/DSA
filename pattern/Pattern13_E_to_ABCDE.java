//5
//E
//DE
//CDE
//BCDE
//ABCDE

package pattern;

import java.util.Scanner;

public class Pattern13_E_to_ABCDE {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{	
			int j = 1;
			char p = (char)('A'+n-i);
			while(j<=i)
			{ 
				System.out.print(p);
				j++;
				p++;
			}
			System.out.println();
			i++;
		}

	}

}
