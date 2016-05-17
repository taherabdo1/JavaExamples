package codility;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MinPerimeterRectangleTest {

	MinPerimeterRectangle minPerimeterRectangle;
	
	@Before
	public void init(){
		minPerimeterRectangle = new MinPerimeterRectangle();
	}
	
	@Test
	public void testSolution(){
		System.out.println( minPerimeterRectangle.solution(30));
		Assert.assertEquals(22 , minPerimeterRectangle.solution(30));
	}
}
