package functions;
import java.util.Scanner;
public class NCR {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
      // For N Factorial (n!= 1x2x3x4......n)
        int Nfact = 1;
        for(int i =1;i<=n;i++)
        {
            Nfact*=i;
        } 
     // For R Factorial (r!= 1x2x3x4......r)
        int Rfact = 1;
        for(int i = 1;i<=r;i++)
        {
            Rfact*=i;
        }
     // For N-R Factorial ((n-r)!= 1x2x3x4......(n-r))
        int NRFact=1;
        for(int i = 1;i<=n-r;i++)
        {
            NRFact*=i;
        }
     //ncr = n!/(r!*(n-r)!)        
        int result = Nfact/(Rfact*NRFact);
        System.out.println(result);
    }


}
