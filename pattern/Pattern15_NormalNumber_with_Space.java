//5
//    1
//   12
//  123
// 1234
//12345
package pattern;

import java.util.Scanner;

public class Pattern15_NormalNumber_with_Space {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) 
		{	int sp = 1;
		while(sp<=n-i) 
		{
			System.out.print(' ');
			sp++;
		}
		int p = 1;
		while(p<=i) 
		{	//p = Natural Number
			System.out.print(p);	
			p++;
		}
		System.out.println();
		i++;
		}

	}
}


