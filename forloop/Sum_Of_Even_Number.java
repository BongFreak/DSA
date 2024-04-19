package forloop;

import java.util.Scanner;

public class Sum_Of_Even_Number {

	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++) 
		{
			int ev = 2*i;
			System.out.println(i+"th even number is "+ev);
			sum=sum+ev;
			System.out.println("individual sum = "+sum);
		}
			System.out.println("final sum is "+ sum);
	

	}

}
