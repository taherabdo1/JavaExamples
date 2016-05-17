package hackerRank.selectedOnes;

import org.junit.Before;
import org.junit.Test;

public class CandiesTest {
	
	Candies candies ;
	@Before
	public void init(){
		candies = new Candies();
	}
	
	@Test
	public void testSolution(){
		System.out.println(candies.getCandiesCount());
	}

}
