package forloop;
import java.util.Scanner;
public class NthFibanacciNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f1 = 1;
		int f2 = 1;
		int new_term=0;
		if(n==1) 
		{
			new_term=1;
		}
		else if(n==2) 
		{
			new_term=1;
		}
		else 
		{
			for(int i=3;i<=n;i++) 
			{
				new_term = f1 + f2;
				f1=f2;
				f2=new_term;
			}
			
		}
		System.out.println(new_term);


		

	}

}
