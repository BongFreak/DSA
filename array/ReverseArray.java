package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the leanth of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i<n;i++) 
		{
			System.out.println("Input the "+i+"th element");
			arr[i]=sc.nextInt();
		}
		
//		int l = arr.length;
		int a = Math.floorDiv(n, 2);
		int temp;
		for(int j=0;j<a;j++) 
		{
			temp = arr[j];
			arr[j] = arr[n-j-1];
			arr[n-j-1] = temp;
	
		}
		for(int element:arr) 
		{
			System.out.print(element+" ");
		}
	}

}
