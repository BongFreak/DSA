package Tree;

import java.util.Scanner;

public class TakeFromUser extends CreateTree {
	public static Node<Integer> takeInput() {
		System.out.println("Enter Root Data");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if (rootData==-1) {
			return null;
		}
		Node<Integer>root = new Node<Integer>(rootData);
		Node<Integer>leftChild = takeInput();
		Node<Integer>rightChild = takeInput();
		root.leftNode = leftChild;
		root.rightNode = rightChild;
		return root;
	}
	public static void main(String[] args) {
		Node<Integer>root = takeInput();
		print(root);

	}

}
