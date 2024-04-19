package array;

import java.util.Scanner;

public class Find_The_Element_Present_Or_Not {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the Array size");
		int n = sc.nextInt();
		float[]arr = new float[n];
		for(int i = 0;i<arr.length;i++) 
		{
			System.out.println("Input the element in"+i+"th index");
			arr[i]=sc.nextFloat();
		}
		System.out.println("Input the searching element");
		float num = sc.nextFloat();
		boolean isInArray = false;
		for(float element:arr) 
		{
			if(num==element) 
			{
				isInArray = true;
				break;
			}
		}
		if(isInArray) 
		{
			System.out.println("Present");
		}
		else 
		{
			System.out.println("Not Present");
		}
		
	}

}
