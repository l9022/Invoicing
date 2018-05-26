package domain;

public class Stockorder {
    private Integer id;
    private String code;
    private Merchandise merchandise;//商品对象
    private Client client;//客户信息（供应商
    private Employee employee;//员工信息（经手人
    private int merchandisenumber;//货物数量
    private String stockorderdate;//订单日期
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Merchandise getMerchandise() {
		return merchandise;
	}
	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getMerchandisenumber() {
		return merchandisenumber;
	}
	public void setMerchandisenumber(int merchandisenumber) {
		this.merchandisenumber = merchandisenumber;
	}
	public String getStockorderdate() {
		return stockorderdate;
	}
	public void setStockorderdate(String stockorderdate) {
		this.stockorderdate = stockorderdate;
	}
    
	@Override
	public String toString() {
		return "Stockorder [id=" + id + ", code=" + code + ", merchandise=" + merchandise + ", client=" + client
				+ ", employee=" + employee + ", merchandisenumber=" + merchandisenumber + ", stockorderdate="
				+ stockorderdate + "]";
	}
}
