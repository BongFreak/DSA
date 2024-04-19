package LinkList;

public class Merge_Two_Sorted_LL extends Linklistuse{
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
		Node<Integer>h1 = takeInput();
		Node<Integer>h2 = takeInput();
		Node<Integer>mNode = mergeLL(h1, h2);
		print(mNode);

	}

}
