package Array_With_Recursion;
import java.util.*;
public class Practice 
{ 	public static int lastIndex(int arr[], int x) {

	return lastIndex(arr,x,arr.length-1);
}
private static int lastIndex(int arr[],int x,int startIndex){ //starindex = input.length-1 pass hoye6e
																//			=4-1= 3
	if(startIndex<0)
		return -1;
	if(arr[startIndex]==x)
		return startIndex;
	return lastIndex(arr,x,startIndex-1); //startIndex-1= 3 nmbr index theke 0 index er dike ja66e
}
public static void main(String[] args) 
{
	int[] arr = {2,2,3,4};
	System.out.println(lastIndex(arr,2));

}


}


