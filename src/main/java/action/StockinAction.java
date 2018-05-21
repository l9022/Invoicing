package action;

import java.util.List;

import domain.Client;
import domain.Employee;
import domain.Merchandise;
import domain.Stockin;
import service.IClientService;
import service.IEmployeeService;
import service.IMerchandiseService;
import service.IStockinService;

public class StockinAction {
	private IStockinService stockinService;
	private IMerchandiseService merchandiseService;
	private IClientService clientService;
	private IEmployeeService employeeService;

	/*
	 * 用来接收前端发来的数据（要找的进货单编号、货物的名称[商品名称]、供应商【客户】 进货日期、经手人[员工]）
	 * 
	 */
	private Stockin stockin;// 用于接收页面中传来的数据
	private List<Stockin> stockins;// 集合用于存放查找所有进货单对象
	private List<Merchandise> merchandises;// 所有商品
	private List<Client> clients;//所有客户信息（供应商
	private List<Employee> employees;//所有员工信息（经手人
	private String[] stockinid;
	
	public IClientService getClientService() {
		return clientService;
	}
	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}
	public IEmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public IStockinService getStockinService() {
		return stockinService;
	}
	public void setStockinService(IStockinService stockinService) {
		this.stockinService = stockinService;
	}
	public IMerchandiseService getMerchandiseService() {
		return merchandiseService;
	}
	public void setMerchandiseService(IMerchandiseService merchandiseService) {
		this.merchandiseService = merchandiseService;
	}
	public Stockin getStockin() {
		return stockin;
	}
	public void setStockin(Stockin stockin) {
		this.stockin = stockin;
	}
	public List<Stockin> getStockins() {
		return stockins;
	}
	public void setStockins(List<Stockin> stockins) {
		this.stockins = stockins;
	}
	public List<Merchandise> getMerchandises() {
		return merchandises;
	}
	public void setMerchandises(List<Merchandise> merchandises) {
		this.merchandises = merchandises;
	}
	public String[] getStockinid() {
		return stockinid;
	}
	public void setStockinid(String[] stockinid) {
		this.stockinid = stockinid;
	}
	
	// 查找进货单
	public String findStockin() {
		merchandises = merchandiseService.findMerchandise(null);
		clients = clientService.findClient(null);
		employees = employeeService.findEmployee(null);
		stockins = stockinService.findStockin(stockin);
		return "findStockin";
	}
	
	// 预查找（货物名称、经手人、供应商等下拉列表框中的内容）
	public String prepStockin() {
		// 从数据库取出所有的商品信息
		merchandises = merchandiseService.findMerchandise(null);
		clients = clientService.findClient(null);
		employees = employeeService.findEmployee(null);
		return "prepStockin";
	}
}
