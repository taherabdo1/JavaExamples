package interviewPracticing;

public class LinkedList<E> {

	static class Node<E> {
		Node next;
		Node previouse;
		E value;

		public Node(Node prvious, E value , Node next) {
			super();
			this.next = next;
			this.value = value;
			this.previouse = previouse;
		}
		
		

		public Node getPreviouse() {
			return previouse;
		}



		public void setPreviouse(Node previouse) {
			this.previouse = previouse;
		}



		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

	}

	Node head;
	Node tail;

	public LinkedList() {
		super();
		head = null;
		tail = null;
	}

	public void addNodeToTail(E value) {
		Node newNode = new Node<E>(null, value , null);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.previouse = tail;
			tail = newNode;
		}
	}

	//remove a specific node
	public void removeNode(Node<E> node) {
		Node temp = head;

		/// if the head is the node to be deleted
		if (temp == node){
			head = head.next;
			head.previouse = null;
		}
			

		// if the node is not the head

		else {
			while (temp != null) {
				if (temp.next == node) {
					temp.next = temp.next.next;
					temp.next.previouse = temp;
					break;
				} else {
					temp = temp.next;
				}
			}
		}
	}
	
	public Node getHead(){
		return head;
	}
	
}
