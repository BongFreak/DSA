package Tree;

public class RemoveLeaf {
	public static Node<Integer> removeLeaf(Node<Integer>root) {
		if (root == null) {
			return null;
		}
		if (root.leftNode==null && root.rightNode==null) {
			return null;
		}
		root.leftNode=removeLeaf(root.leftNode);
		root.rightNode=removeLeaf(root.rightNode);
		return root;
		
	}	
	public static void main(String[] args) {

	}

}
