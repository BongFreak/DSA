package Queue;
import java.util.*;
public class reverse_Queue {
public static void reverseQueue(Queue<Integer>q) {
	if (q.size()<=1) {
		return;
	}
	int x = q.remove();
	reverseQueue(q);
	q.add(x);
}
	public static void main(String[] args) {
		Queue<Integer>q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
		reverseQueue(q);
		System.out.println(q);
	}

}
