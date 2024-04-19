package Sorting;

public class Merge_Sort02 {
	 
    
    public static void conquer(int[] arr, int si,int mid ,int ei){
        int[] merged = new int[ei+1];//starting index to ending index 
        int idx1 = si;
        int idx2 = mid+1;    
        int x = si;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1 <= mid){
             merged[x++] = arr[idx1++];
        }
         while(idx2 <= ei){
              merged[x++] = arr[idx2++];
         }
         for(int i = si; i<=ei; i++) {
        	 arr[i] = merged[i];
         }
    }
    public static void devide(int[] arr, int si ,int ei){
        if(si>=ei)return;
    	int mid = si+(ei-si)/2;
        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
public static void main(String[] args) {
	 int[] arr={1,5,9,8,2,3,4,7,6};
	    int n = arr.length;
		System.out.println("Before Sorting");
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		devide(arr,0,n-1);
		System.out.println("After Sorting");
		for(int val:arr) {
			System.out.print(val+" ");
		}
		

}


}
