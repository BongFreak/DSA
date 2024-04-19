package fundamentals;
import java.util.Scanner;

public class FindThePowerofANumber 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		int n=1;
		int i=1;
		while(i<=b)
		{
			n=n*a;
			i++;

		}
		System.out.print(n);

	}



}


