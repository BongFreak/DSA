package BST;
import Tree.*;
public class Max_Min_Element {
	public static int checkMax(Node<Integer>root) {
		if (root==null) {
			return 0;
		}
		if (root.rightNode!=null) {
			return checkMax(root.rightNode);
		}
		else {
			return root.data;
		}
	}
	public static int checkMin(Node<Integer>root) {
		if (root==null) {
			return 0;
		}
		if (root.leftNode!=null) {
			return checkMin(root.leftNode);
		}
		else {
			return root.data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
