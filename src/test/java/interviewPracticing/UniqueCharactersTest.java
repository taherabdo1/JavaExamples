package interviewPracticing;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UniqueCharactersTest {

	UniqueCharacters uniqueCharacters = null;
	
	@Before
	public void init (){
		uniqueCharacters = new UniqueCharacters();
	}
	
	@Test
	public void testSolution(){
		String str = "qwertyuiopasdfghjkl";
		Assert.assertEquals(true,uniqueCharacters.solution(str));
	}
}
