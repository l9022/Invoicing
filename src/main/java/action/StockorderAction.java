package action;

import java.util.List;

import domain.Client;
import domain.Employee;
import domain.Merchandise;
import domain.Stockorder;
import service.IClientService;
import service.IEmployeeService;
import service.IMerchandiseService;
import service.IStockorderService;

public class StockorderAction {
    private Stockorder stockorder;
    private IStockorderService stockorderService;
    private IMerchandiseService merchandiseService;
	private IClientService clientService;
	private IEmployeeService employeeService;
	
	/*
	 * 用来接收前端发来的数据（要找的进货单编号、货物的名称[商品名称]、供应商【客户】 进货日期、经手人[员工]）
	 * 
	 */
    private List<Stockorder> stockorders;//接收从页面传来的数据
    private List<Merchandise> merchandises;// 所有商品
	private List<Client> clients;//所有客户信息（供应商
	private List<Employee> employees;//所有员工信息（经手人 
	
	private String finish_url;
	private String[] stockorderId;
	
	public Stockorder getStockorder() {
		return stockorder;
	}
	public void setStockorder(Stockorder stockorder) {
		this.stockorder = stockorder;
	}
	public IStockorderService getStockorderService() {
		return stockorderService;
	}
	public void setStockorderService(IStockorderService stockorderService) {
		this.stockorderService = stockorderService;
	}
	public IMerchandiseService getMerchandiseService() {
		return merchandiseService;
	}
	public void setMerchandiseService(IMerchandiseService merchandiseService) {
		this.merchandiseService = merchandiseService;
	}
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
	public List<Stockorder> getStockorders() {
		return stockorders;
	}
	public void setStockorders(List<Stockorder> stockorders) {
		this.stockorders = stockorders;
	}
	public List<Merchandise> getMerchandises() {
		return merchandises;
	}
	public void setMerchandises(List<Merchandise> merchandises) {
		this.merchandises = merchandises;
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
	public String getFinish_url() {
		return finish_url;
	}
	public void setFinish_url(String finish_url) {
		this.finish_url = finish_url;
	}
	public String[] getStockorderId() {
		return stockorderId;
	}
	public void setStockorderId(String[] stockorderId) {
		this.stockorderId = stockorderId;
	}
	
	public String findStockorder() {
		merchandises = merchandiseService.findMerchandise(null);
		clients = clientService.findClient(null);
		employees = employeeService.findEmployee(null);
		stockorders = stockorderService.findStockorder(stockorder);
		return "findStockorder";
	}
	
}
