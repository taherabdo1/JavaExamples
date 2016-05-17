package hackerRank;

import org.junit.Before;
import org.junit.Test;

public class CavityMapTest {

	CavityMapSolution cavityMapSolution;
	
	@Before
	public void init(){
		cavityMapSolution = new CavityMapSolution();
	}
	
	@Test
	public void testSolveCavityMap(){
		cavityMapSolution.solveCavityMap();
	}
}
