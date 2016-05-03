package connectis;

public class LinkedQueue<T> {

	Node<T> head;
	Node<T> tail;

	class Node<T> {
		T value;
		Node nextNode;

		public Node(T value, Node nextNode) {
			this.value = value;
			this.nextNode = nextNode;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

	}

	public LinkedQueue() {
		head = new Node<T>(null, null);
		tail = new Node<T>(null, null);
	}

	//insert new node at the tail of the queue
	public void enqueue(T value) {
		//queue is empty
		if (head.value == null) {
			head.value = value;
			head.nextNode = null;
			tail = head;
		}
		//queue has only one node
		else if (head.equals(tail) && head.value != null) {

			tail.nextNode = new Node<T>(value, null);
			tail = tail.nextNode;
			head.nextNode = tail;
		}
		// more than one node in the queue
		else {
			tail.nextNode = new Node<T>(value, null);
			tail = tail.nextNode;

		}
	}

	//return head
	public T dequeue() {
		if (head != null) {
			T result = head.value;
			head = head.nextNode;
			if (head == null)
				head = new Node(null, null);
			return result;
		} else {
			return null;
		}
	}

}
