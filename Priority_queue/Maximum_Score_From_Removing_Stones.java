package Priority_queue;

import java.util.*;

public class Maximum_Score_From_Removing_Stones {
	 public static int maximumScore(int a, int b, int c) {
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        pq.add(a);
	        pq.add(b);
	        pq.add(c);
	        
	        int pts = 0;
	        
	        while(pq.size()>1) {
	        	int rmv1 = pq.remove();
	        	int rmv2 = pq.remove();
	        	rmv1--;
	 	        rmv2--;
	 	        pts++;
	 	        if (rmv1>0) {
					pq.add(rmv1);
				}
	 	        if (rmv2>0) {
					pq.add(rmv2);
				}
	        }
	        return pts;
	       
	    }

	public static void main(String[] args) {
		 int a = 2, b = 4, c = 6;
		 System.out.println(maximumScore(a, b, c));

	}

}
