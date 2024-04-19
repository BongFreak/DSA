//5
//  *
// ***
//*****
// ***
//  *

package pattern;
import java.util.Scanner;
public class Pattern21_Diamond_Of_Star 
{

	public static void main(String[] args) 
	{ Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n1=(n+1)/2;
    int n2=n/2;
    for(int i=1;i<=n1;i++)  //this is for n1(first part)
    {
        for(int sp1=1;sp1<=n1-i;sp1++)
        {
            System.out.print(" ");
        }
        for(int str1=1;str1<=((2*i)-1);str1++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n2;i>=1;i--)  //this is for n2(Second part)
    {
        for(int sp2=1;sp2<=(n2-i)+1;sp2++)
        {
            System.out.print(" ");
        }
        for(int str2=(2*i)-1;str2>=1;str2--)
        {
            System.out.print("*");
        }
        System.out.println();
    }	
	}
}


