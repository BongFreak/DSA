package functions;

import java.util.Scanner;

public class Celcious_to_Fahrenheit 
{
	public static float conv(float c) 
	{
		float f;
		 f = ( c * 1.8f ) + 32;
		 return f;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		System.out.println(conv(c));
	}

}
