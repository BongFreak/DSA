package LinkList;

public class Even_Odd_SortingLL extends Linklistuse {
	public static Node<Integer> evenOdd(Node<Integer>head) {
		Node<Integer>h = head;
		Node<Integer>dodd = new Node<Integer>(-1);
		Node<Integer>t1 = dodd;
		Node<Integer>deven = new Node<Integer>(-1);
		Node<Integer>t2 = deven;
		while (h!=null) {
			if(h.data%2!=0) {
				t1.next=h;
				t1=t1.next;
				h=h.next;
			}
			else {
				t2.next=h;
				t2=t2.next;
				h=h.next;
			}
		}
		t1.next = deven.next;
		return dodd.next;
}
	public static void main(String[] args) {
		Node<Integer>headNode = takeInput();
		print(headNode);
		Node<Integer>headNode2 = evenOdd(headNode);
		print(headNode2);
	}

}
