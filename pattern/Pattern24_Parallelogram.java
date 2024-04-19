//5
//*****
// *****
//  *****
//   *****
//    *****

package pattern;
import java.util.Scanner;

public class Pattern24_Parallelogram {

	public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for( int sp=0;sp<=i-1;sp++)
            {
                System.out.print(" ");
            }
            for(int str=1;str<=n;str++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
