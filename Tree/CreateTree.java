package Tree;

public class CreateTree {
	public static void print(Node<Integer>root) {
		if (root==null) {
			return;
		}
		System.out.print("RT "+root.data + ": ");
		if (root.leftNode!=null) {
			System.out.print("L "+root.leftNode.data +" , ");
		}
		if (root.rightNode!=null) {
			System.out.print("R "+root.rightNode.data);
		}
		System.out.println();
		print(root.leftNode);
		print(root.rightNode);
//		if (root.leftNode!= null) {
//			print(root.leftNode);
//		}
//		if (root.rightNode!=null) {
//			print(root.rightNode);
//		}
		
	}

	public static void main(String[] args) {
		Node<Integer>root = new Node<Integer>(1);
		Node<Integer>rootLeft = new Node<Integer>(2);
		Node<Integer>rootRight = new Node<Integer>(3);
		root.leftNode = rootLeft;
		root.rightNode = rootRight;
		Node<Integer>twoRight = new Node<Integer>(4);
		Node<Integer>twoLeft = new Node<Integer>(5);
		rootLeft.rightNode = twoRight;
		rootLeft.leftNode = twoLeft;
		Node<Integer>threeLeft = new Node<Integer>(6);
		rootRight.leftNode = threeLeft;
		print(root);
		
	}

}
