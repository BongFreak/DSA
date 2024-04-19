//5
//12345
//2345
//345
//45
//5
package pattern;
import java.util.Scanner;
public class Pattern05 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i<=n) 
		{
			int j = i;
			while(j<=n) 
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
				

	}

}
