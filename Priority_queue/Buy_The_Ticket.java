package Priority_queue;
import java.util.*;
public class Buy_The_Ticket {
public static int  buyTicket(int input[],int k) {
	Queue<Integer> q = new LinkedList<>();
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	for(int element: input) {
		q.add(element);
		pq.add(element);
	}
	int time = 0;
	while(!q.isEmpty()) {
		if (input[q.peek()]<pq.peek()) {
			q.add(q.remove());
		}else {
			int idx = q.remove();
			pq.remove();
			time++;
			if (idx == k) {
				break;
			}
		}
	}
	return time;
}
	public static void main(String[] args) {
		int[] arr = {2,3,2,2,4};
		int k = 3;
		System.out.println();
	}

}
