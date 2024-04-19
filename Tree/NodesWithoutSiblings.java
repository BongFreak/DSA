package Tree;

public class NodesWithoutSiblings {
	public static void check(Node<Integer>root) {
		if (root==null) {
			return;
		}
		if(root.leftNode!=null && root.rightNode==null) {
			System.out.println(root.leftNode.data);
		}
		if (root.leftNode==null && root.rightNode!=null) {
			System.out.println(root.rightNode.data);
		}
		check(root.leftNode);
		check(root.rightNode);
	}
	public static void main(String[] args) {
		
	}

}
