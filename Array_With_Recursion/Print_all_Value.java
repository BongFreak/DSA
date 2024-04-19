package Array_With_Recursion;

public class Print_all_Value {
	public static void printvalue(int arr[], int idx){
        //Base Case
		if(idx==arr.length)return;
		//Self Work
        System.out.println(arr[idx]);//(arr[idx]) because it print current index value. 
        //Small Case
        printvalue(arr,idx+1);
	}
	public static void main(String[] args) {
		int arr[] = {5,6,8,5,9,10};
		printvalue(arr,0);//(arr, 0) because array will be print from 0th index to last index.

	}

}
