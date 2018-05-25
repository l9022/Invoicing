package dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Merchandise;
import domain.Stockin;

public class StockinDaoTest {

	@Test
	public void testFindStockin() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StockinDao stockinDao=(StockinDao) context.getBean("stockinDao");
	    Stockin stockin=new Stockin();
	    stockin.setCode("001");
		List<Stockin> ss = stockinDao.findStockin(stockin);
		System.out.println(ss);
	}
	
	@Test
	public void testSaveStockin() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StockinDao stockinDao = (StockinDao) context.getBean("stockinDao");
		Stockin stockin = new Stockin();
		Merchandise merchandise = new Merchandise();
		merchandise.setId(1);
		stockin.setCode("003");
		stockin.setMerchandise(merchandise);
		stockinDao.saveStockin(stockin);
	}
	
	@Test
	public void testFindStockinByCode() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StockinDao stockinDao=(StockinDao) context.getBean("stockinDao");
	    Stockin stockin=new Stockin();
	    stockin.setCode("001");
		List<Stockin> ss = stockinDao.findStockin(stockin);
		System.out.println(ss);
	}
	
	@Test
	public void testdelStockin() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StockinDao stockinDao=(StockinDao) context.getBean("stockinDao");
		int s = 7;
		stockinDao.delStockin(s);
		
	}

}
