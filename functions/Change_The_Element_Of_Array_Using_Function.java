package functions;
import java.util.*;
public class Change_The_Element_Of_Array_Using_Function 
{
	static void change(int[]arr) 
	{	
		arr[3] = 100;
	}
	public static void main(String[] args) 
	{
		int[] marks = {89,78,98,99};
		change(marks);
		for(int e: marks) 
		{
			System.out.print(e+" ");
		}
		
	}
}
