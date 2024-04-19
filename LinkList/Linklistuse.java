package LinkList;


import java.util.Scanner;

public class Linklistuse {
	public static Node<Integer> createLinklist() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
		
	}
	public static void print(Node<Integer>head) {
		Node<Integer>temp = head;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next; 
		}
		System.out.println();
		temp = head;
	}
	public static void incriment(Node<Integer>head) {
//		head.data++;
		Node<Integer>temp = head;
		while (temp!=null) {
			temp.data++;
			temp = temp.next;
		}
		temp = head;
	}
	private static int length(Node<Integer>head) {
		Node<Integer>temp = head;
		int count = 0;
		while (temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
		
	}
	public static Node<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null;
		while (data != -1) {
			Node<Integer>currentNode = new Node<Integer>(data);
			if (head == null) {
				head = currentNode;
			}
			else {
				Node<Integer> tail = head;
				while (tail.next!=null) {
					tail = tail.next;
				}
				tail.next = currentNode;
			}
			data = sc.nextInt();
		}
		return head;
		
	}
	public static Node<Integer> takeInput2() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null, tail = null;
		while (data != -1) {
			Node<Integer>currentNode = new Node<Integer>(data);
			if (head == null) {
				head = currentNode;
				tail = currentNode;
			}
			else {
				
				tail.next = currentNode;
				tail = currentNode;// tail= tail.next;
			}
			data = sc.nextInt();
		}
		return head;
		
	}
	 public static Node<Integer> insertAtPosition(Node<Integer> head, int data, int position) {
	      Node<Integer> new_node = new Node<>(data);
	      if (position == 0) {
	         new_node.next = head;
	         return new_node;
	      }
	      Node<Integer> temp = head;
	      int count = 0;
	      while(count<position-1 && temp!= null) {
	    	  count++;
	         temp = temp.next;
	      }
	      if (temp!=null) {
			new_node.next = temp.next;
			temp.next = new_node;
		}
	     
	      return head;
	   }
	 public static Node<Integer>insertAtPositionR(Node<Integer> head, int data, int position) {
		 if(position==0) {
			 Node<Integer>newNode = new Node<>(data);
			 newNode.next = head;
			 return newNode;
		 }
		 else {
			head.next = insertAtPositionR(head.next, data, position-1);
		}
		return head;
	}
	 public static Node<Integer>Delete(Node<Integer> head,int position){
		 if(head==null) return head;
		 if(position==0)return head.next;
		 int count = 0;
		 Node<Integer>temp=head;
		 while (temp!=null &&count<position-1) {
			temp = temp.next;
			count++;
		}
		 if (temp==null) {
			return head;
		}
		 if (temp!=null) {
			temp.next=temp.next.next;
		}
		 return head;
	 }
	 public static Node<Integer>DeleteR(Node<Integer> head,int position){
		 if (head==null) {
			return head;
		}
		 if (position==0) {
			return head.next;
		}
		 head.next=Delete(head.next, position-1);
		 return head;
	 }
	 public static Node<Integer>ReverseR(Node<Integer> head){
		 if(head==null) {
			 return head;
		 }
		 if(head.next==null) {
			 return head;
		 }
		 Node<Integer>tail = head.next;
		 Node<Integer>reverseHead = ReverseR(head.next);
		 tail.next=head;
		 head.next=null;
		 return reverseHead;
	 }
	 public static Node<Integer>Reverse(Node<Integer> head){
		 if(head==null||head.next==null) {
			 return head;
		 }
		 Node<Integer>current = head;
		 Node<Integer>prev = null;
		 while (current!= null) {
			 Node<Integer>forward = current.next;
			 current.next=prev;
			 current=forward;
		}
		 return head;
	 }
	 public static Node<Integer> findMiddleElement(Node<Integer>head) {
		Node<Integer>slow = head;
		Node<Integer>fast = head;
		while (fast.next!=null&&fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> headNode =takeInput();// createLinklist();
//		print(headNode);
//		insertAtPositionR(headNode, 10, 3);
		print(headNode);
//		DeleteR(headNode, 1);
	headNode=Reverse(headNode);
//		findMiddleElement(headNode);
	print(headNode);
		
//		incriment(headNode);
//		print(headNode);
//		System.out.println(length(headNode));
		
		
//		System.out.println(headNode.data);
//		System.out.println(headNode.next.data);
//		
//		Node<Integer> n1 = new Node<>(10);
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
	}

}
