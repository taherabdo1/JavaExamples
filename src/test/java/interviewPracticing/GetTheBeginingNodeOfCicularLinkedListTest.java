package interviewPracticing;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class GetTheBeginingNodeOfCicularLinkedListTest {

	GetTheBeginingNodeOfCicularLinkedList obj = null;
	LinkedList<Character> charsList = null;
	@Before
	public void init(){
		obj = new GetTheBeginingNodeOfCicularLinkedList();
		charsList = new LinkedList<>();
		charsList.add(new Character('A'));
		charsList.add(new Character('B'));
		charsList.add(new Character('C'));
		charsList.add(new Character('D'));
		charsList.add(new Character('E'));
		charsList.add(new Character('C'));
	}
	
	@Test
	public void testHappySceinario(){
		System.out.println(obj.solution(charsList));
	}
}
