//5
//11111
//22222
//33333
//44444
//55555

package pattern;
import java.util.Scanner;

public class Pattern02 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i = 1;
		while(i<=n) 
		{
			int j = 1;
			while(j<=n) 
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
