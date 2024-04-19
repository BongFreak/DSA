package LinkList;

public class Polindrome extends Linklistuse{
	public static Node<Integer>rr(Node<Integer>head) {
		if (head==null || head.next==null) {
			return head;
		}
		
		 Node<Integer>tail = head.next;
		 Node<Integer>reverseHead = rr(head.next);
		 tail.next=head;
		 head.next=null;
		 return reverseHead;
	}
	public static Node<Integer>mpoint(Node<Integer>head) {
		Node<Integer>small = head;
		Node<Integer>fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			small = small.next;
			fast = fast.next.next;
		}
//		System.out.println(small.data);
		return head;
	}
	private static boolean polindrome(Node<Integer>head) {
		if (head==null || head.next==null) {
			return true;
		}
		Node<Integer>head1 = head;
		Node<Integer>midNode = mpoint(head1);
		Node<Integer>head2 = midNode.next;
		midNode.next=null;
		head2 = rr(head2);
		while (head1!=null && head2!=null) {
			if (head1.data!=head2.data) {
				return false;
			}
			head1=head1.next;
			head2=head2.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Node<Integer>headNode = takeInput();
		print(headNode);
//		headNode=rr(headNode);
//		print(headNode);
//		mpoint(headNode);
		boolean ans=polindrome(headNode);
		System.out.println(ans);
	}

}
