package Queue;

class Node<T>{
	T data;
	Node<T> next;
	Node(T data) {
		this.data = data;
	}
}
public class UsingLL {
	static Node<Integer> head;
	static Node<Integer> tail;
	static int s;
	public static void add(int x) {
		Node<Integer> n1 = new Node<>(x);
		if (s==0) {
			head = n1;
			tail = n1;
		}
		else {
			tail.next=n1;
			tail = n1;
		}
		s++;
	}
	public static int remove() {
		if (s==0) {
			return -1;
		} else {
			int ans = head.data;
			head = head.next;
			s--;
			return ans;
		}
		
	}
	public static int size() {
		return s;
	}
	public static int peek() {
		if (s==0) {
			return -1;
		} else {
			return head.data;
		}
	}
	public static boolean isEmpty() {
		return s==0;
	}
	public static void main(String[] args) {
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
		System.out.println(peek());
		System.out.println(size());
		System.out.println(remove());
		System.out.println(peek());
		System.out.println(size());
		System.out.println(isEmpty());
		
		
		

	}

}
