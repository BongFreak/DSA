// 5
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321
package pattern;
import java.util.Scanner;
public class Pattern22_Number_Star {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                
                if(j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
	}

}
