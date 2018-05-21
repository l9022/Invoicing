package service;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import domain.Employee;

public class EmployeeServiceTest {

	@Test
	public void testFindEmployee() {
		ApplicationContext Context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeService=(EmployeeService) Context.getBean("employeeService");
		Employee employee = new Employee();
		employee.setCode("001");
		employeeService.findEmployee(employee);
	}

	@Test
	public void testFindEmployeeByCodeService() {
		ApplicationContext Context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeService=(EmployeeService) Context.getBean("employeeService");
		Employee employee = new Employee();
		employee.setCode("001");
		employeeService.findEmployeeByCode(employee);
	}
	
	@Test
	public void testsaveEmployee() {
		ApplicationContext Context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeService=(EmployeeService) Context.getBean("employeeService");
		Employee employee = new Employee();
		employee.setCode("005");
		employee.setName("Hack");
		employee.setBirthday("1996-01-31");
		employee.setSex("男");
		employee.setTelephone("15523324393");
		employee.setEmail("Hack@zz.com");
		employeeService.saveEmployee(employee);
	}
}
