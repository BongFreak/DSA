package LinkList;

public class Node2Use {
	//Normal Function For DISPLAY
//	public static void display(Node2 head) {
//		Node2 temp = head;
//		while (temp!=null) {
//			System.out.print(temp.data + " ");
//			temp = temp.nextNode2;
//		}
//	}
	
	//Recursive Function For DISPLAY
//	public static void displayr(Node2 head) {
//		if (head== null) {
//			return;
//		}
//		System.out.print(head.data+" ");
//		displayr(head.nextNode2);
//	}
	//Normal Function For Length
	public static int length(Node2 a) {
		int count = 0;
		while(a != null) {
			count++;
			a = a.nextNode2;
		}
		return count;
	}

	public static void main(String[] args) {
		Node2 a = new Node2(5);// head node
		Node2 b = new Node2(6);
		Node2 c = new Node2(15);
		Node2 d = new Node2(50);
		
		a.nextNode2 = b; 
		b.nextNode2 = c; 
		c.nextNode2 = d; 
		
//		Node2 temp = a;
//		System.out.println(a.data);
//		System.out.println(a.nextNode2.data);
		
		//When i know the LinkList Size
//		for(int i =1;i<5;i++) {
//			System.out.print(temp.data + " ");
//			temp = temp.nextNode2;
//		}
		
//		////When i don't know the LinkList Size
//		while (temp!=null) {
//			System.out.print(temp.data + " ");
//			temp = temp.nextNode2;
//		}
//		displayr(a);
		
		System.out.println(length(a));
	}

}
