package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockorderTest {

	@Test
	public void test() {
		Stockorder s = new Stockorder();
		s.setCode("001");
		s.setMerchandisenumber(2);
		s.setStockorderdate("2018-05-26");
		
	    System.out.println(s.toString());
	}

}
