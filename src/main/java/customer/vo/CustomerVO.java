package customer.vo;

import java.sql.Date;

public class CustomerVO {
	private int id;
	private String name;
	private String email;
	private int age;
	private Date entryDate;
	
	public CustomerVO() {
		
	}
	
	public CustomerVO(int id, String name, String email, int age, Date entryDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.entryDate = entryDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", entryDate="
				+ entryDate + "]";
	}
	
}
