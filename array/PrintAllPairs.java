package array;

import java.util.Scanner;

public class PrintAllPairs {
	public static void print_all_pairs(int[] input) {
		int n = input.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				System.out.println("("+input[i] +"," +input[j]+")");
			}
			
		}
	}
	public static int[] takeinput() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the leanth of Array");
		int n = sc.nextInt();
		int[] arr= new int[n];	//creating a new Array
		for(int i=0;i<n;i++) 
		{
			System.out.println("Input the number of "+i+"th index");
			arr[i] = sc.nextInt(); //store the number in ith index 
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();
		print_all_pairs(arr);

	}

}
