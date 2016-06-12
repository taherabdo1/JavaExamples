package interviewPracticing;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class GetTheBeginingNodeOfCicularLinkedList {

	/**
	 * Given a circular linked list, implement an algorithm which returns the
	 * node at the beginning of the loop. DEFINITION Circular linked list: A
	 * (corrupt) linked list in which a node's next pointer points to an earlier
	 * node, so as to make a loop in the linked list. EXAMPLE Input: A - > B - >
	 * C - > D - > E - > C [the same C as earlier] Output: C
	 */
	public Character solution(LinkedList<Character> list){
		Character result = null;
		Set<Character> charSet = new HashSet<>();
		for(Character element : list){
			if(charSet.contains(element))
				return element;
			else
				charSet.add(element);
		}
		
		return result;
	}
}
