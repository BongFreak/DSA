package forloop;
import java.util.*;
import java.util.Scanner;

public class Find_The_Factorial {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mal = 1 ;
		for(int i=1;i<=n;i++) 
		{
			mal = mal*i;
			System.out.println(i+"th Factorial" );
			
		}
		System.out.println("final Factorial is "+ mal);
	}

}
