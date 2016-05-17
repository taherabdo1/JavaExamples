package hackerRank;

import org.junit.Before;
import org.junit.Test;

public class StockMaximizeTest {

	StockMaximize stockMaxProfit;
	@Before
	public void init(){
		stockMaxProfit = new StockMaximize();
	}
	
	@Test
	public void testGetMaxStockProfit(){
		stockMaxProfit.getMaxStockProfit();
	}
	
//	@Test
//	public void testStairs(){
//		stockMaxProfit.StairCase(5);
//	}
}
