package Tree;

public class Node<T> {
	public T data;
	public Node<T> rightNode;
	public Node<T> leftNode;
	public Node(T data) {
		this.data = data;
	}
}
