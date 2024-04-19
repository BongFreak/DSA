package BST;
import java.util.*;

import Tree.Node;
public class FindPath {
	public static ArrayList<Integer> getPath(Node<Integer>root,int data) {
		if (root==null) {
			return  null;
		}
		if (root.data==data) {
			ArrayList<Integer>output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		if (data<root.data) {
			ArrayList<Integer>LeftOutput = getPath(root.leftNode, data);
			if (LeftOutput!=null) {
				LeftOutput.add(root.data);
			}
			return LeftOutput;
		}else {
			ArrayList<Integer>RightOutput = getPath(root.rightNode, data);
			if (RightOutput!=null) {
				RightOutput.add(root.data);
			}
			return RightOutput;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
