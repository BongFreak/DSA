package Priority_queue;
import java.util.*;
public class Fundamental {

	public static void main(String[] args) {
		PriorityQueue<Integer>queue = new PriorityQueue<>();
		queue.add(10);
		queue.add(13);
		queue.add(9);
		queue.add(50);
		queue.add(60);
		queue.add(1);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println(queue.remove());
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue);
		

	}

}
