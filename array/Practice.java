package array;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) 
	{
		System.out.println("Input Test Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) 
		{
			int sum=0;
			System.out.println("Input Size");
			int m = sc.nextInt();
			int[] arr = new int[m];
			for(int j= 0;j<n;j++) 
			{
				System.out.println("Input Number for "+j+"th index");
				arr[j]= sc.nextInt();
			}
			for(int j= 0;j<n;j++) 
			{
				sum = sum + arr[j];
				System.out.println(sum);
			}
		}
		
		
	}

}
