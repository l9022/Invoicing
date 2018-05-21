package domain;

public class Employee {
	private Integer id;
	private String code;//
	private String name;//
	private String birthday;//
	private String sex;//
	private String telephone;//
	private String email;//
	
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		if(null!=birthday && birthday.length()>=10) {
			birthday=birthday.substring(0, 10);
		}
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", code=" + code + ", name=" + name + ", birthday=" + birthday + ", sex=" + sex
				+ ", telephone=" + telephone + ", email=" + email + "]";
	}
	
}
