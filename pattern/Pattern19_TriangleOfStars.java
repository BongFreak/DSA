//5
//    *
//   ***
//  *****
// *******
//*********
package pattern;
import java.util.Scanner;

public class Pattern19_TriangleOfStars {

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
			while(inc<=i) 
			{
				System.out.print("*");
				inc++;
			}
			int dec=i-1;
			while(dec>=1) 
			{
				System.out.print("*");
				dec--;
			}
			System.out.println();
			i++;
					
		}



	}

}
