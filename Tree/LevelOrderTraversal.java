package Tree;

import java.util.*;


public class LevelOrderTraversal {
	public static void printLevelOrder(Node<Integer>root) {
		Queue<Node<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (queue.size()>0) {
			int count = queue.size();
			for(int i = 0;i<count;i++) {
				Node<Integer>node = queue.remove();
				System.out.print(node.data+" ");
				if (node.leftNode!=null) {
					queue.add(node.leftNode);
				}
				if (node.rightNode!=null) {
					queue.add(node.rightNode);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		

	}

}
