package Stack;

class Node<T> {
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
		next = null;
	}
}
public class LinkList  {
	static Node<Integer> headNode;
	static Node<Integer> tailNode;
	static int s;
	public static void push(int x) {
		Node<Integer>n1 = new Node<>(x);
		if (s==0) {
			headNode = n1;
			tailNode = n1;
		}
		else {
			n1.next = headNode;
			headNode = n1;
			
		}
		s++;
	}
	public static int size() {
		return s;
	}
	public static int peek() {
		if (s==0) {
			return -1;
		} else {
			return headNode.data;
		}
	}
	public static int pop() {
		if (s==0) {
			return -1;
		} else {
			int res = headNode.data;
			headNode = headNode.next;
			s--;
			return res;
		}
		
	}
	public static boolean isEmpty() {
		return s==0;
	}
	

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		System.out.println(peek());
		System.out.println(isEmpty());
		System.out.println(size());
		System.out.println(pop());
		System.out.println(peek());
		System.out.println(size());
		

	}

}

