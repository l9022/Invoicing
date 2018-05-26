package dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Stockorder;

public class StockorderDaoTest {

	@Test
	public void testFindStockorder() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StockorderDao stockorderDao=(StockorderDao) context.getBean("stockorderDao");
	    Stockorder stockorder=new Stockorder();
	    stockorder.setCode("001");
		List<Stockorder> ss = stockorderDao.findStockorder(stockorder);
		System.out.println(ss);
	}

}
