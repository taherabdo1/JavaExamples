package codility;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SolutionNestedTest {

	SolutionNested solution;
	@Before
	public void init(){
		 solution = new SolutionNested();
	}
	@Test
	public void testIsProperlyNested(){
		Assert.assertEquals(0,solution.isProperlyNested("([)()]"));
	}
	
	@Test
	public void testIsProperlyNestedEmpty(){
		Assert.assertEquals(1,solution.isProperlyNested(""));
	}
	
	@Test
	public void testIsProperlyNestedStartWithClose(){
		Assert.assertEquals(0,solution.isProperlyNested(")[)()]"));
	}
}
