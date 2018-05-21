package domain;

public class Merchandise {
	private Integer id;// 流水号（数据库中主键）
	private String code;// 商品编号
	private String name;// 商品名称
	private float price;// 商品单价
	//private String price;
	
	/*public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}*/
	// 无参数构造方法
	public Merchandise() {
		super();
	}
	// 有参数构造方法
	public Merchandise(String code, String name, float price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Merchandise [id=" + id + ", code=" + code + ", name=" + name + ", price=" + price + "]";
	}
}
