package service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Stockorder;

public class StockorderServiceTest {

	@Test	
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StockorderService stockorderService = (StockorderService) context.getBean("stockorderService");
		Stockorder stockorder = new Stockorder();
		stockorder.setCode("001");
		List<Stockorder> ss = stockorderService.findStockorder(stockorder);
		System.out.println(ss);
	}

}
