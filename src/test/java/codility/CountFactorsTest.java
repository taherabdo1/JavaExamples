package codility;

import org.junit.Before;
import org.junit.Test;

public class CountFactorsTest {

	CountFactors countFactors = null;
	
	@Before
	public void init(){
		countFactors = new CountFactors();
	}
	
	@Test
	public void testHappySceinario(){
		System.out.println(countFactors.solution(24));
	}
}
