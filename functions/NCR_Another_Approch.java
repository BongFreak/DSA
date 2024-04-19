package functions;
import java.util.Scanner;
public class NCR_Another_Approch {
	public static int factorial(int num) 
	{
		int fact = 1;
		for(int i = 1;i<=num;i++) 
		{
			fact *=i;
		}
		return fact;
	}
	public static int ncr(int n , int r) 
	{
		 int Nfact = factorial(n);
	     int Rfact = factorial(r);
	     int NRfact = factorial(n-r);
	     int result = Nfact/(Rfact*NRfact);
	     return result;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = ncr(n,r);
        System.out.println(result);
    }


}
