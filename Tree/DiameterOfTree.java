package Tree;

public class DiameterOfTree {
	class TreeInfo{
		int ht;
		int dim;
		public TreeInfo(int ht,int dim) {
			this.ht = ht;
			this.dim = dim;
		}
	}
	public static TreeInfo diameter(Node<Integer>root) {
		if (root==null) {
			return new TreeInfo(0,0);
		}
		TreeInfo left = diameter(root.leftNode);
		TreeInfo right = diameter(root.rightNode);
		int myHeight = Math.max(left.ht, right.ht)+1;
		int diam1 = left.dim;
		int diam2 = right.dim;
		int diam3 = left.ht +right.ht+1;
		
		int myDiam = Math.max(Math.max(diam1, diam2), diam3); 
		TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
		return myInfo;
	}

	public static void main(String[] args) {
		

	}

}
