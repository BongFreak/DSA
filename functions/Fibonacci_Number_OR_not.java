package functions;
import java.util.Scanner;
public class Fibonacci_Number_OR_not 
{
	public static boolean perfectSquare(int x)
	{
		int s = (int)Math.sqrt(x);
		return (s*s==x); 
	// return er value true tokhn ei debe jokhn 
	// (s*s==x) er value satisfie hbe

	}

	public static boolean checkMember(int n)
	{
		return perfectSquare((5*n*n)+4)||perfectSquare((5*n*n)-4);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkMember(n));

	}

}
