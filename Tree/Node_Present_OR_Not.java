package Tree;

public class Node_Present_OR_Not {
public static boolean check(Node<Integer>root,int x) {
		if (root==null) {
		return false;
		}
		if (root.data==x) {
		return true;
		}
		return check(root.leftNode, x) || check(root.rightNode, x) ;
	}
}
