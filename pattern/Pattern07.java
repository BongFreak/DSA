//5
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 
package pattern;
import java.util.Scanner;
public class Pattern07 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int p =1;
		while(i<=n) 
		{
			int j = 1;
			while(j<=i) 
			{
				System.out.print(p+" ");
				j++;
				p++;
			}
			System.out.println();
			i++;
			
		}
				

	}

}
