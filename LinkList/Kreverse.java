package LinkList;

import java.util.Scanner;

public class Kreverse extends Linklistuse{
	public static Node<Integer> k_reverse(Node<Integer>head,int k) {
		 if(head==null)
	            return head;
	        if(head.next==null)
	            return head;
	        if(k==0)
	            return head;
		Node<Integer>h1 = head;
		Node<Integer>t = head;
		int count = 1;
		while (count<k && t.next!= null) {
			t=t.next;
			count++;
		}
		Node<Integer>h2 = t.next;
		t.next = null;
		Node<Integer>h1ReverseNode = ReverseR(h1);
		
		Node<Integer>t1 = h1ReverseNode;
		while (h1ReverseNode!=null) {
			t1=t1.next;
			h1ReverseNode = h1ReverseNode.next;
		}
		t1.next = h2;
		return h1ReverseNode;
	}

	public static void main(String[] args) {
		Node<Integer>headNode = takeInput();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node<Integer>headNode2 = k_reverse(headNode, n);
		print(headNode2);

	}

}
