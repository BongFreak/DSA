package Sorting;

public class Quick_Sort {
	public static void display(int[] arr) {
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}
	public static void swap(int[] arr,int x,int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	public static int partition(int[] arr,int si,int ei) {
		int pivot = arr[si];
		int count = 0;
		for(int i = si+1;i<=ei;i++) {
			if(arr[i]<=pivot) {
				count ++;
			}
		}
		int pivotIndex = si+count;
		swap(arr,si,pivotIndex);
		int i = si;
		int j = ei;
		while(i<pivotIndex && j>pivotIndex) {
			while(arr[i]<=pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<pivotIndex && j>pivotIndex) {
				swap(arr,i,j);
				i++;
				j--;
			}
		}
		
		return pivotIndex;
	}
	public static void quickSort(int[] arr,int si,int ei) {
		if(si>=ei)return;
		int pi = partition(arr,si,ei);
		quickSort(arr,si,pi-1);
		quickSort(arr,pi+1,ei);
	}
	public static void quickSort(int[] arr) {
		int n = arr.length;
		quickSort(arr,0,n-1);
		display(arr);
	}
	
	public static void main(String[] args) {
		int[] arr={1,5,9,8,2,3,4,7,6};
	    
		System.out.println("Before Sorting");
		display(arr);
		System.out.println();
		
		System.out.println("After Sorting");
		quickSort(arr);
		
	}

}
