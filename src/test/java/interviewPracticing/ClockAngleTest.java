package interviewPracticing;

import org.junit.Before;
import org.junit.Test;

public class ClockAngleTest {

	ClockAngle clockAngle = null;
	
	@Before
	public void init(){
		clockAngle = new ClockAngle();
	}
	
	@Test
	public void testBaseCase(){
		System.out.println(clockAngle.getAngle(9, 10));
	}
}
