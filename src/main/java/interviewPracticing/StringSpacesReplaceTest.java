package interviewPracticing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StringSpacesReplaceTest {

	StringSpacesReplace stringSpace = null;
	char[] input = {'M','r',' ','J','o','h','n',' ',' ','S','m','i','t','h',' ',' ',' '};;
	@Before
	public void init(){
		stringSpace = new StringSpacesReplace();
	}
	
	@Test
	public void testSolution() {
		Assert.assertEquals(stringSpace.solution(input),"Mr%20John%20%20Smith");
	}

}
