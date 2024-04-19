//5
//ABCDE
//BCDEF
//CDEFG
//DEFGH
//EFGHI

package pattern;

import java.util.Scanner;

public class Pattern12_NormalAlphabet_Square {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{	char p = (char)('A'+i-1);
			int j = 1;
			while(j<=n)
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
