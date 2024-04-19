package forloop;
import java.util.Scanner;
public class Decimal_TO_Binary {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        String b =" ";//String value number er moto +,- hoyna
        int n = sc.nextInt();
        int t =n; //we take t because of not to change the value of n;
        if(n==0)
        {
            System.out.print(n);
        }
        while(t>0)//t>0 because t ta jotokhn na zero hoy totokhn loop ta cholbe.
        {
            int r = t%2;//r= reminder
            t=t/2;
            b=r+b;//r+b use to reverse the number and b+r use to take the number as it is.
        }
        System.out.println(b);
		

	}

}
