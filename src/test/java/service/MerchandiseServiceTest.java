package service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.MerchandiseService;
import domain.Merchandise;

public class MerchandiseServiceTest {

	@Test
	public void testMerchandiseService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MerchandiseService merchandiseService = (MerchandiseService) context.getBean("merchandiseService");
		Merchandise merchandise = new Merchandise();
		merchandise.setCode("001");
		List<Merchandise> ms = merchandiseService.findMerchandise(merchandise);
		System.out.println(ms);
	}
	
	@Test
	public void testSaveMerchandise() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MerchandiseService merchandiseService = (MerchandiseService) context.getBean("merchandiseService");
		Merchandise merchandise = new Merchandise();
		merchandise.setCode("003");
		merchandise.setName("琴");
		merchandise.setPrice(800);
		merchandiseService.saveMerchandise(merchandise);
	}

	@Test
	public void testFindMerchandiseByCode() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MerchandiseService merchandiseService = (MerchandiseService) context.getBean("merchandiseService");
		Merchandise merchandise = new Merchandise();
		merchandise.setCode("001");
		List<Merchandise> ms = merchandiseService.findMerchandiseByCode(merchandise);
		System.out.println(ms);
	}
	
	@Test
	public void testDelMerchandise() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MerchandiseService merchandiseService = (MerchandiseService) context.getBean("merchandiseService");
		int m = 5;
		merchandiseService.delMerchandise(m);
		
	}
}
