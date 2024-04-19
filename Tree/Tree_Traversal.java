package Tree;

public class Tree_Traversal {
	public static void preorder(Node<Integer>root) {
		if (root==null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.leftNode);
		preorder(root.rightNode);
	}
	public static void inorder(Node<Integer>root) {
		if (root==null) {
			return;
		}
		inorder(root.leftNode);
		System.out.println(root.data);
		inorder(root.rightNode);
	}
	public static void postorder(Node<Integer>root) {
		if (root==null) {
			return;
		}
		postorder(root.leftNode);
		postorder(root.rightNode);
		System.out.println(root.data);
	}

	public static void main(String[] args) {
		
		
	}

}
