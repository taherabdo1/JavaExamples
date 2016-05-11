package codility;

import org.junit.Before;
import org.junit.Test;

public class EquiLeaderTest {
	EquiLeader equiLeader = null;
	@Before
	public void init(){
		equiLeader = new EquiLeader();
	}
	
	@Test
	public void testGetQuiLedersCount(){
		int[] test = {3,4,4,4,4,2};
		System.out.println(equiLeader.solution(test));
	}
}
