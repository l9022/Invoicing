package service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.StockinService;
import domain.Client;
import domain.Merchandise;
import domain.Stockin;

public class StockinServiceTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StockinService stockinService=(StockinService) context.getBean("stockinService");
	    Stockin stockin=new Stockin();
	    stockin.setCode("001");
		List<Stockin> ss = stockinService.findStockin(stockin);
		System.out.println(ss);
	}
	
	@Test
	public void testSaveStockin() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StockinService stockinService = (StockinService) context.getBean("stockinService");
		Stockin stockin = new Stockin();
		Merchandise merchandise = new Merchandise();
		merchandise.setId(3);
		stockin.setCode("002");
		stockin.setMerchandise(merchandise);
		stockinService.saveStockin(stockin);
	}

}
