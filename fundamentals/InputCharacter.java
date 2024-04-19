package fundamentals;

import java.util.Scanner;

public class InputCharacter 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(0);
		System.out.println(ch);
		
	}
	

}
