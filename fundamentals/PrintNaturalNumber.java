package fundamentals;
import java.util.Scanner;
public class PrintNaturalNumber {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int i=1, n;
		n = s.nextInt();
		while(i<=n) 
		{
			System.out.println(i);
			i = i+1;
		}

	}

}
