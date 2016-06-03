package interviewPracticing;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import interviewPracticing.RemoveDuplicateInLinkedList.Node;

public class RemoveDuplicateInLinkedListTest {

	RemoveDuplicateInLinkedList duplicateInLinkedList = null;
	Node<Integer> int1 = null;

	@Before
	public void init() {
		int1 = new Node<Integer>(1, null);
		int1.setNext(new Node<Integer>(2, null));
		int1.getNext().setNext(new Node<Integer>(1, null));
		duplicateInLinkedList = new RemoveDuplicateInLinkedList();
	}

	@Test
	public void testSolution1() {
		duplicateInLinkedList.solution1(int1);
		while (int1.getValue() != null) {
			System.out.println(int1.getValue());
			int1 = int1.getNext();
		}
	}

	@Test
	public void testAddLinkedLists() {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(7);
		list1.add(1);
		list1.add(6);

		list2.add(5);
		list2.add(9);
		list2.add(2);

		LinkedList<Integer> result = duplicateInLinkedList.addLinkedLists(list1, list2);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
