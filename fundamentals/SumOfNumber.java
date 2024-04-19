package fundamentals;
import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) 
	{
		int i=1, sum=0, n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while(i<=n) 
		{
			sum = sum+i;
			i = i+1;
		}
		System.out.println(sum);

	}

}
