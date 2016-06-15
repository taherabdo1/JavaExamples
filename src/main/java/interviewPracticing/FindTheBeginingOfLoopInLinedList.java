package interviewPracticing;


public class FindTheBeginingOfLoopInLinedList <T> {

	/**
	 * Given a circular linked list, implement an algorithm which returns the
	 * node at the beginning of the loop. DEFINITION Circular linked list: A
	 * (corrupt) linked list in which a node's next pointer points to an earlier
	 * node, so as to make a loop in the linked list. EXAMPLE Input: A - > B - >
	 * C - > D - > E - > C [the same C as earlier] Output: C
	 * @param <T>
	 */
	
	public LinkedList.Node solution(LinkedList<T> list){
		LinkedList.Node<T> fastRunner = list.getHead().next.next;
		LinkedList.Node<T> slowRunner = list.getHead().next;
		
		//loop until the two runners collide
		while(fastRunner != slowRunner){
			fastRunner = fastRunner.next.next;
			slowRunner = slowRunner.next;
		}
		
		//reinitialize the slowRunner to the beginning of the list and move toward each other
		slowRunner = list.getHead();
		while(slowRunner != fastRunner){
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.previouse;
		}
		//now we are sure that the collision point is the beginning of the loop 
		return slowRunner; 
	}
	
}
