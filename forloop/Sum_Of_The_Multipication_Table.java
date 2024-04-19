package forloop;

import java.util.Scanner;

public class Sum_Of_The_Multipication_Table {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //8
		int sum = 0;
		for(int i = 1;i<=10;i++) 
		{
			int m = i*n;
			System.out.println(i+" x "+n+" = "+m);
			sum = sum+m;
			System.out.println("individual sum = "+sum);
		}
		System.out.println("total sum = "+sum);
	}

}
