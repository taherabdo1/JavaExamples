package leet_code;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class RansomNoteTest {

	RansomNote ransomNote;
	
	@Before
	public void init(){
		ransomNote = new RansomNote();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testHappyScenario(){
		Assert.assertEquals(ransomNote.canConstruct("aa", "baaaaaaaa"), true);
	}
	
}
