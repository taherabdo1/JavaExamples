package connectis;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CodilityExamTest {
	CodilityExam codilityExam;
	@Before
	public void init(){
		 codilityExam = new CodilityExam();
	}
	
	@Test
	public void testGetMaxHour(){
		Assert.assertEquals("20:40", codilityExam.getMaxHour(0,0,4,2));
	}
	
	@Test
	public void testGetElevatorStopsNumber(){
		int[] A = { 60, 80, 40 };
		int[] B = { 2, 3, 5 };
		Assert.assertEquals(5 , codilityExam.getElevatorStopsNumber(A, B, 5, 2, 200));

	}
}
