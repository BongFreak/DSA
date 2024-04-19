package fundamentals;
import java.util.Scanner;

public class NumberIsEvenOrNot 
{

	public static void main(String[] args) 
	{
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		if(a%2==0)
		{
			System.out.println(a + " Even ");
		}
		else
		{ 
			System.out.println(a + " Odd ");
		}
		
		
	}

}
