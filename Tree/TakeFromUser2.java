package Tree;

import java.util.Scanner;

public class TakeFromUser2 extends CreateTree {
	public static Node<Integer> takeInput(boolean isRoot,int parentData,boolean isLeft) {
		if (isRoot) {
			System.out.println("Enter Root Data");
		}
		else if (isLeft) {
			System.out.println("Enter The Left Child of " + parentData);
		}else {
			System.out.println("Enter The Right Child of " + parentData);
		}
		
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if (rootData==-1) {
			return null;
		}
		Node<Integer>root = new Node<Integer>(rootData);
		Node<Integer>leftChild = takeInput(false,rootData,true);
		Node<Integer>rightChild = takeInput(false,rootData,false);
		root.leftNode = leftChild;
		root.rightNode = rightChild;
		return root;
	}
	public static void main(String[] args) {
		Node<Integer>root = takeInput(true,0,false);
		print(root);

	}

}
