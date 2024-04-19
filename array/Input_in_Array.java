package array;
import java.util.Scanner;
public class Input_in_Array {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("write the number of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("Input the number in "+i+"th index");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
