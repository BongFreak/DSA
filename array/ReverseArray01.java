package array;

public class ReverseArray01 {

	public static void main(String[] args) {

		int arr[] = {1,2,3,5,6};
		int n = arr.length;
		int ans[] = new int [n];
		int j =0;
		for(int i = n-1;i>=0;i--) { 	//traverse original array from n-1 to 0 (reverse direction)
			ans[j++] = arr[i];
		}
		for(int element:ans) {
			System.out.print(element+" ");
		}
		

	}

}
