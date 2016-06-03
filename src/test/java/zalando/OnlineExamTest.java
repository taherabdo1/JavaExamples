package zalando;

import org.junit.Before;
import org.junit.Test;

public class OnlineExamTest {

	OnlineExam onlineExam = null;
	
	@Before
	public void init(){
		onlineExam = new  OnlineExam();
	}
	
	@Test
	public void test(){
		int[] testSample = {1,2,6,6,6,8,9,5,9};
//		System.out.println(Character.isAlphabetic('?'));
		System.out.println(onlineExam.solution32(testSample));
		
	}
}
