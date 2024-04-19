package array;

public class ReverseArray02 {
	 public static void swap(int[] arr , int i , int j){
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j]= temp;
	    }
	    public static void reverse(int[] arr){
	        int i = 0 ;int j = arr.length-1; //i and j are two pointer
	        while(i<j){
	            swap(arr,i,j);
	            i++;
	            j--;
	        }
	    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		reverse(arr);
		for(int element:arr){
		    System.out.print(element+" ");
		}
	}

}
