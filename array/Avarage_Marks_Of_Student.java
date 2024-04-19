package array;

import java.util.Scanner;

public class Avarage_Marks_Of_Student {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of Students");
		int avg = 1;
		int sum = 0;
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<arr.length;i++) 
		{
			System.out.println("Input the "+i+"th Students Number");
			arr[i]=sc.nextInt();
		}
		for(int elements:arr) 
		{
			sum = sum+ elements;
		}
		avg = sum/arr.length;
		System.out.println("The Avarage is "+avg);

	}

}
