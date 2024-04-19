package fundamentals;
import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) 
	{
		int s, w, e;
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt(); //Starting point
		e = sc.nextInt(); //Ending point
		w = sc.nextInt(); //Gap point
		
		while(s<=e)
		{
			System.out.println(s + " " + ((5*s)-160)/9);
			s = s+w;
		}

	}

}
