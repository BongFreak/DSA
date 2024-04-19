package array;
import java.util.Scanner;
public class Input_in_array_using_Function 
{
	public static void printarray(int[] arr) 
	{
		int n = arr.length;
		for(int i =0;i<n;i++) 
		{
			System.out.println(arr[i]);
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

	public static void main(String[] args) 
	{
		int []arr = takeinput();
		printarray(arr);

	}

}
