package Priority_queue;
import java.util.*;
public class Kth_Largest_Element_In_An_Array {
public static int findKthLargest(int[] nums, int k) {
	
//	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//	for(int element : nums) {
//		pq.add(element);
//	}
//      for(int i = 1; i<k;i++) {
//    	  pq.remove();
//      } 
//      int x = pq.remove();
//      return x;
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	for(int i = 0; i<nums.length;i++) {
		if (pq.size()<k) {
			pq.add(nums[i]);
		}
		else if (pq.peek()<nums[i]) {
			pq.remove();
			pq.add(nums[i]);
		}
	}
	return pq.peek();
   }
	

	public static void main(String[] args) {
		int[] arr = {3,2,3,1,2,4,5,5,6};
		int[] arr1 = {3,2,1,5,6,4};
		System.out.print(findKthLargest(arr,4));
	}

}
