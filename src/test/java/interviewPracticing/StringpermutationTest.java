package interviewPracticing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StringpermutationTest {

	Stringpermutation stringPermutation = null;
	
	@Before
	public void init(){
		stringPermutation = new Stringpermutation();
	}
	@Test
	public void testIsPermutations() {
		Assert.assertEquals(stringPermutation.isPermutations("2wed", "thare") , true);
	}

}
