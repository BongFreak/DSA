package Tree;

public class SumOfNodes {
	public static int sum(Node<Integer> rootNode ) {
		if (rootNode==null) {
			return 0;
		}
		int x = sum(rootNode.leftNode);
		int y = sum(rootNode.rightNode);
		int ans = x+y+rootNode.data;
		return ans;
	}

	public static void main(String[] args) {
		

	}

}
