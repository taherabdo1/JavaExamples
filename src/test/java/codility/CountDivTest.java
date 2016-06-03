package codility;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;


public class CountDivTest {

	CountDiv countDiv = null;
	
	@Before
	public void init(){
		countDiv = new CountDiv();
	}
	
	@Test
	public void testHappySceinario(){
		System.out.println(countDiv.solution(3,26,5));
		Assert.assertEquals(countDiv.solution(3,26,5) , 5);
	}
}
