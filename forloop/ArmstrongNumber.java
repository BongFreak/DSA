//371, as 3^3 + 7^3 + 1^3 = 371
//1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
//Those are Armstrong Number
package forloop;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=n,result=0;
        String s = Integer.toString(n);
        int num = s.length();
        while(a!=0)
        {
            int r = a%10;
            result += Math.pow(r,num);
             a= a/10;
        }
        
        if(result==n)
        {
            System.out.println("true");

        }
        else
        {
            System.out.println("False");
        }

	}

}
