package interviewPracticing;

public class BinarySearchTree<T extends Comparable<T>> {

	Node head;

	public BinarySearchTree() {
			}

	public BinarySearchTree(T value) {
		super();
		head = new Node<T>(value);
	}

	class Node<T extends Comparable<T>> {
		T value;
		Node right;
		Node left;

		public Node(T value) {
			super();
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

	}

	public void insert(T value) {
		// the tree is empty
		if (head == null) {
			head = new Node<T>(value);
			head.left = null;
			head.right = null;
		}
		// if the tree holds at least one element
		else {
			Node temp = head;
			Node leaf = null;
			char flag = 0 ;
			// loop to reach the leaves
			while (temp != null) {
				if (value.compareTo((T) temp.value) <= 0) {
					leaf = temp;
					temp = temp.left;
					flag = 'l';
				} else if (value.compareTo((T) temp.value) > 0) {
					leaf= temp;
					temp = temp.right;
					flag = 'r';
				}
			}
			//here temp should be null and the leaf should be leaf node.
			if(flag == 'r')
				leaf.right = new Node(value);
			else if(flag == 'l'){
				leaf.left = new Node(value);
			}
		}
	}

}
