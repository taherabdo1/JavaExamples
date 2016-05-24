package interviewPracticing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StringCompressionTest {

	StringCompression stringCompression = null;
	
	@Before
	public void init(){
		stringCompression = new StringCompression();
	}
	
	@Test
	public void testSolution() {
		System.out.println(stringCompression.solution("aabcccccaaa"));
		Assert.assertEquals(stringCompression.solution("aabcccccaaa"), "a2b1c5a3");
	}

}
