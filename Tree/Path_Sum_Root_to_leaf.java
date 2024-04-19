package Tree;

public class Path_Sum_Root_to_leaf {
	public static void check(Node<Integer>root,int k,String path,int sum) {
		if (root==null) {
			return;
		}
		if (root.leftNode==null && root.rightNode==null) {
			sum = sum +root.data;
			if (sum==k) {
				System.out.println(path+root.data);
			}
			return;
		}
		check(root.leftNode, k, path+root.data, sum+root.data);
		check(root.rightNode, k, path+root.data, sum+root.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
