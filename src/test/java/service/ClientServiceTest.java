package service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Client;

public class ClientServiceTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClientService clientService = (ClientService) context.getBean("clientService");
		Client client = new Client();
		client.setCode("001");
		List<Client> ms = clientService.findClient(client);
		System.out.println(ms);
	}

}
