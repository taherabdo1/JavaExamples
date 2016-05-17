package codility;

import org.junit.Before;
import org.junit.Test;

public class MaxProfitTest {

	MaxProfit maxProfit;
	int[] input = {23171,21011,21123,21366,21013,21367};

	@Before
	public void init(){
		maxProfit = new MaxProfit();
	}
	
	@Test
	public void testSolution(){
		System.out.println(maxProfit.solution(input));
	}
}
