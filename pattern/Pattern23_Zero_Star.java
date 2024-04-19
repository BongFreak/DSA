// 5
// *0000*0000*
// 0*000*000*0
// 00*00*00*00
// 000*0*0*000
// 0000***0000
package pattern;
import java.util.Scanner;
public class Pattern23_Zero_Star {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int col=n*2+1;
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=col;j++)
			{

				if(j==n+1||j==i||j+i==(n+1)*2)
				{
					System.out.print("*");

				}
				else
				{
					System.out.print("0");

				}

			}
			System.out.println();
		}

	}

}
