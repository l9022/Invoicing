package service;

import java.util.List;

import domain.Employee;

public interface IEmployeeService {
	/**
	 * 
	 * @param employee 封装了要查询的编号和姓名的编号
	 * @return 符合条件的对象
	 */
	public List<Employee> findEmployee(Employee employee);
	
	/**
	 * 用于保存数据到数据库
	 * @param employee 
	 * @return
	 */
	public void saveEmployee(Employee employee);
	
	/**
	 * 
	 * @param employee 封装了要查询的编号
	 * @return 符合条件的对象
	 */
	public List<Employee> findEmployeeByCode(Employee employee);
	
	/**
	 * 用于将新的数据重新保存到数据库
	 * @param employee
	 */
	public void updateEmployee(Employee employee);
	
	public void delEmployee(int employee);
}
