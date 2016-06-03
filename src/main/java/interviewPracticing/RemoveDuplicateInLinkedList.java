package interviewPracticing;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

public class RemoveDuplicateInLinkedList {

	static class Node<T> {
		private T value;
		private Node next;

		public Node(T value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	/*
	 * remove duplicate nodes with O(N) space and O(N) CPU
	 */
	public void solution1(Node head) {
		Node previous = null;
		Hashtable table = new Hashtable();
		while (head != null) {
			if (table.get(head.getValue()) == null) {
				table.put(head.getValue(), true);
				previous = head;
			} else {
				previous.next = head.next;
			}
			head = head.next;
		}
	}

	/*
	 * add revesed numbers expressed as a digites in a linkedLists
	 */
	public LinkedList<Integer> addLinkedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> result = new LinkedList<>();

		Integer result2 = new Integer("0");

		Integer temp11 = new Integer("0");
		Integer temp22 = new Integer("0");
		
		int inc = 1;
		
		for (int i = 0; i < list1.size(); i++) {
			temp11 = temp11 + (list1.get(i) * inc);
			inc *= 10;
		}
		
		inc = 1;
		for (int i = 0; i < list2.size(); i++) {
			temp22 = temp22 + (list2.get(i) * inc);
			inc *= 10;
		}
		
		result2 = temp11 + temp22;
		String tempResult= result2.toString();

		for( int i = tempResult.length()-1 ; i >=0 ;i--){
			result.add(new Integer(tempResult.charAt(i)+""));
		}
		return result;
	}
}
