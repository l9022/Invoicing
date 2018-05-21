package service;

import java.util.List;

import dao.IEmployeeDao;
import domain.Employee;

public class EmployeeService implements IEmployeeService{
	//根据要找的信息  查找所有的信息
	
	private IEmployeeDao employeeDao;
	
	public IEmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> findEmployee(Employee employee) {
		return employeeDao.findEmployee(employee);
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}

	@Override
	public List<Employee> findEmployeeByCode(Employee employee) {
		return employeeDao.findEmployeeByCode(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		this.employeeDao.updateEmployee(employee);
		
	}
	@Override
	public void delEmployee(int employee) {
		employeeDao.delEmployee(employee);
	}
	
}
