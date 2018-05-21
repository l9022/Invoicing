package dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Employee;

public class EmployeeDaoTest {

	@Test
	public void testFindEmployee() {
		ApplicationContext Context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeedao=(EmployeeDao) Context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setCode("001");
		employeedao.findEmployee(employee);
	}

	@Test
	public void testFindEmployeeByCode() {
		ApplicationContext Context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeedao=(EmployeeDao) Context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setCode("001");
		employeedao.findEmployeeByCode(employee);
	}
	
	@Test
	public void TestSaveEmployee() {
		ApplicationContext Context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao=(EmployeeDao) Context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setCode("004");
		employee.setName("Arch");
		employee.setBirthday("1999-07-21");
		employee.setSex("女");
		employee.setTelephone("17523987493");
		employee.setEmail("Arch@zz.com");
		employeeDao.saveEmployee(employee);
	}
}
