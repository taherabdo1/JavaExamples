package interviewPracticing;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

	BinarySearchTree<Integer> tree = null;
	
	@Before
	public void init(){
		tree = new BinarySearchTree<>();
	}
	
	@Test
	public void testInsert(){
		tree.insert(1);
		System.out.println(tree.head.value);
		tree.insert(-1);
		tree.insert(3);
		tree.insert(4);
		System.out.println(tree.head.left.value);
		System.out.println(tree.head.right.value);
		System.out.println(tree.head.right.right.value);
	}
}
