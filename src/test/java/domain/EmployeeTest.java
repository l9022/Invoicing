package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		Employee employee = new Employee();
		employee.setId(001);
		employee.setCode("1001");
		employee.setName("张三");
		employee.setBirthday("1998-02-27");
		employee.setSex("男");
		
		System.out.println(employee.toString());
	}

}
