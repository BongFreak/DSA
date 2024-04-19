package BinarySearcg;

public class BinarySearch {
	public static int binarySearch(int[]arr,int x) {
		int n = arr.length;
		
		return binarySearch(arr,0,n-1,x);
	}
	public static int binarySearch(int[]arr , int si , int ei , int x) {
		//base case
		if(si>ei) {
			return -1;
		}
		int midIndex = (si + ei)/2;//si+(ei-si)/2;
		if(arr[midIndex]==x) {
			return midIndex;
		}
		else if(arr[midIndex]> x) {
			return binarySearch(arr,si,midIndex-1,x);//sub problem
		}
		else {
			return binarySearch(arr,midIndex+1,ei,x); //arr[midIndex]< x //sub problem
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,5,6,8,10};
		for(int i = 0;i<=10;i++)
		System.out.printf("%d exists in Index: %d\n",i,(binarySearch(arr,i)));

	}

}
