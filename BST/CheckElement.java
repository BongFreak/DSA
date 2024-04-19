package BST;

import Tree.*;

public class CheckElement  {
	public static boolean check(Node<Integer>root,int x) {
		if (root==null) {
			return false;
		}
		if (root.data==x) {
			return true;
		}
		else if (root.data>x) {
			return check(root.leftNode, x);
		}
		else {
			return check(root.rightNode, x);
		}
	}

	public static void main(String[] args) {
		

	}

}
