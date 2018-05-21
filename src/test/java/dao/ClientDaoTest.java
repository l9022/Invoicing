package dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Client;

public class ClientDaoTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClientDao clientDao = (ClientDao) context.getBean("clientDao");
		Client client = new Client();
		client.setCode("001");
		List<Client> ms = clientDao.findClient(client);
		System.out.println(ms);
	}

}
