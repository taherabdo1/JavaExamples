package java_7_new_features;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class MainEntryTest {
	
	MainEntry mainEntry;
	
	@Before
	public void init(){
		mainEntry = new MainEntry();
	}
	
	
	@Test
	public void testGetFibunatche(){
		LinkedList<Integer> testFibu = new LinkedList<>();
		testFibu.add(34);
		testFibu.add(8);
		testFibu.add(13);
		testFibu.add(7);
		testFibu.add(1000);
		for(Integer i : mainEntry.getFibunitche(testFibu)){
			System.out.println(i);
		}
	}
	
	
	@Test
	public void testNewSwich(){
		mainEntry.testNewSwich();
	}

}
