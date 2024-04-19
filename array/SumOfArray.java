package array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("input the ARRAY Size");
		int n = sc.nextInt();
		float[]arr = new float[n];
		float sum = 0;
		for(int i = 0;i<arr.length;i++) 
		{
			System.out.println("input the elemint in "+i+"th index");
			arr[i]=sc.nextFloat();
			
		}
		for(float element:arr)
		{
			sum = sum + element;
		}
		System.out.println(sum);

	}

}
