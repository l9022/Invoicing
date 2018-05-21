package dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Merchandise;

public class MerchandiseDaoTest {

	@Test
	public void testFindMerchandise() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MerchandiseDao merchandiseDao = (MerchandiseDao) context.getBean("merchandiseDao");
		Merchandise merchandise = new Merchandise();
		merchandise.setCode("001");
		List<Merchandise> ms = merchandiseDao.findMerchandise(merchandise);
		System.out.println(ms);
	}
	
	@Test
	public void testSaveMerchandise() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MerchandiseDao merchandiseDao = (MerchandiseDao) context.getBean("merchandiseDao");
		Merchandise merchandise = new Merchandise();
		merchandise.setCode("001");
		merchandise.setName("百合子");
		merchandise.setPrice(1000);
		merchandiseDao.saveMerchandise(merchandise);
	}

	@Test
	public void testFindMerchandiseByCode() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MerchandiseDao merchandiseDao = (MerchandiseDao) context.getBean("merchandiseDao");
		Merchandise merchandise = new Merchandise();
		merchandise.setCode("001");
		List<Merchandise> ms = merchandiseDao.findMerchandiseByCode(merchandise);
		System.out.println(ms);
	}
	
	@Test
	public void testDelMerchandise() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MerchandiseDao merchandiseDao = (MerchandiseDao) context.getBean("merchandiseDao");
		int m = 1;
		merchandiseDao.delMerchandise(m);
		
	}
}
