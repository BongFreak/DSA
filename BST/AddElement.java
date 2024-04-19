package BST;

import Tree.Node;

public class AddElement {
	public static Node<Integer> add(Node<Integer>root,int x) {
		if (root==null) {
			return new Node<Integer>(x);
		}
		if (root.data==x) {
			return root;
		}
		else if (root.data>x) {
			root.leftNode = add(root.leftNode, x);
		}else {
			root.rightNode = add(root.rightNode, x);
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
