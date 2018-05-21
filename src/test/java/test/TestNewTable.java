package test;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import domain.Employee;

public class TestNewTable {

	@Test
	public void inserttest() {
		Configuration config = new Configuration().configure();//加载hibernate.hbm.xml
		SessionFactory sessionFactory = config.buildSessionFactory();//获取SessionFactory
		Session session = sessionFactory.openSession();//得到一个session
		Transaction t = session.beginTransaction();//开启事务
		
		Employee employee = new Employee();
		//employee.setId(1);
		employee.setCode("005");
		employee.setName("小红");
		employee.setBirthday("1999-03-23");
		employee.setSex("女");
		employee.setTelephone("15344359034");
		employee.setEmail("xiaohong@zz.com");
		
		session.save(employee);
		t.commit();
		session.close();
		sessionFactory.close();
	}

}
