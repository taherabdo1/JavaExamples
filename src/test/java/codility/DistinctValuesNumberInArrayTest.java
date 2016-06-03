package codility;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DistinctValuesNumberInArrayTest {

	DistinctValuesNumberInArray distinctValuesNumberInArray = null;
	int[] input = {1};
	int[] input1={};
	int[] input2= {1,1,1,2,2,3,4,5};
	@Before
	public void init(){
		distinctValuesNumberInArray = new DistinctValuesNumberInArray();
	}
	
	@Test
	public void testHappySceinario(){
		Assert.assertEquals((distinctValuesNumberInArray.solution(input2)), 5);
	}
	@Test
	public void testOneEntryArr(){
		Assert.assertEquals((distinctValuesNumberInArray.solution(input)),1);
	}
	@Test
	public void testZeroEntryArr(){
		
		Assert.assertEquals((distinctValuesNumberInArray.solution(input1)),0);
	}
}
