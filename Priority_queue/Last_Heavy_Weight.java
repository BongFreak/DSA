package Priority_queue;
import java.util.*;
public class Last_Heavy_Weight {
public static int lastStoneWeight(int[] stones) {
	
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	for(int element : stones) {
		pq.add(element);
	}
	while(pq.size()>1) {
		int y = pq.remove();
		int x = pq.remove();
		if (x!=y) {
			y=y-x;
			pq.add(y);
		}
	}
	if (pq.size()==0) {
		return 0;
	}
	return pq.element();
        
 }
	public static void main(String[] args) {
		int[] arr = {2,7,4,1,8,1};
		int[] arr1 = {2,2,4,4};
		System.out.print(lastStoneWeight(arr1));

	}

}
