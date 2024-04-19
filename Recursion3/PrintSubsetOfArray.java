package Recursion3;

public class PrintSubsetOfArray {
	public static void printSubSet(int[]arr ,int indx,String ans) {
		if (indx==arr.length) {
			System.out.println(ans);
			return;
		}
		printSubSet(arr, indx+1, ans);
		printSubSet(arr, indx+1, arr[indx]+ans+" ");
	}

	public static void main(String[] args) {

	}

}
