package LinkList;

public class Merge_Sort_LL extends Linklistuse {
	public static Node<Integer> mergeSort(Node<Integer>h1) {
		if(h1==null || h1.next==null)return h1;
		Node<Integer>midNode = findMiddleElement(h1);
		Node<Integer>h2 = midNode.next;
		midNode.next=null;
		Node<Integer>p1 = mergeSort(h1);
		Node<Integer>p2 = mergeSort(h2);
		Node<Integer>finaNode = mergeLL(p1, p2);
		return finaNode;
	}
	public static Node<Integer> mergeLL(Node<Integer>h1,Node<Integer>h2) {
		Node<Integer>dummyNode = new Node<Integer>(-1);
		Node<Integer>t = dummyNode;
		while (h1!=null && h2!=null) {
			if (h1.data<=h2.data) {
				t.next=h1;
				t=t.next;
				h1=h1.next;
			} else {
				t.next=h2;
				t=t.next;
				h2=h2.next;

			}
			if(h1!=null) {
				t.next = h1;
			}
			if(h2!=null) {
				t.next = h2;
			}
		}
		return dummyNode.next;
	}
	public static void main(String[] args) {
		Node<Integer>headNode = takeInput();
		print(headNode);
		Node<Integer>headNode2 = mergeSort(headNode);
		print(headNode2);
	}

}
