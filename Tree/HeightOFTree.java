package Tree;

public class HeightOFTree {
	public static int height(Node<Integer>root) {
		if (root==null) {
			return 0;
		}
		int h1 = height(root.leftNode);
		int h2 = height(root.rightNode);
		return Math.max(h1, h2)+root.data;
	}

	public static void main(String[] args) {
		

	}

}
