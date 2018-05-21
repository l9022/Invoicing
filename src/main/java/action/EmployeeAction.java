package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import domain.Employee;
import service.IEmployeeService;


public class EmployeeAction extends ActionSupport{
	private Employee employee;
	private IEmployeeService employeeService;
	private List<Employee> employees;//存放查找员工对象
	private String[] empId;
	private String finish_Url;
	
	public IEmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public String getFinish_Url() {
		return finish_Url;
	}
	public void setFinish_Url(String finish_Url) {
		this.finish_Url = finish_Url;
	}
	public String[] getEmpId() {
		return empId;
	}
	public void setEmpId(String[] empId) {
		this.empId = empId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	//通过编号、姓名向数据库查询数据
	public String findEmployee() {
		employees=employeeService.findEmployee(employee);
		return "findEmployee";
	}
	
	//向数据库新增数据
	public String saveEmployee() {
		employeeService.saveEmployee(employee);
		finish_Url = "employeeAction_findEmployee.action";
		return "finish";
	}
	
	//通过编号向数据库取得一串数据，输出
	public String findEmployeeByCode(){
		employee=employeeService.findEmployeeByCode(employee).get(0);
		return "findEmployeeByCode";
	}
	
	//通过查询的数据更改后重新写入数据库
	public String updateEmployee() {
		employeeService.updateEmployee(employee);
		finish_Url = "employeeAction_findEmployee.action";
		return "finish";
	}
	
	//删除
	public String delEmployee(){
		if(null != empId) {
			for(String s: empId) {
				System.out.println(empId);
				this.employeeService.delEmployee(Integer.parseInt(s));;
				System.out.println(s);
			}
		}
		finish_Url = "employeeAction_findEmployee.action";
		return "finish";
	}
		
}
