package array;

public class Sorted_The_Array {

	public static void main(String[] args) 
	{
		boolean isSorted = true;
		int[] arr = {12,15,16,20,100};
		for(int i = 0; i<arr.length-1;i++) 
		{
			if(arr[i]>arr[i+1]) 
			{
				isSorted = false;
			}
		}
		if(isSorted) 
		{
			System.out.println(" The array is sorted");
		}
		else 
		{
			System.out.println(" The array is not sorted");
		}
	}

}
