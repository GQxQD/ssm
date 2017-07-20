package cn.gqxqd.entity;

import java.util.Date;

public class School {

	private Integer id;
	private String name;
	private String address;
	private String tel;
	private Date schoolDate;
	public School(Integer id, String name, String address, String tel, Date schoolDate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.schoolDate = schoolDate;
	}
	public School() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getSchoolDate() {
		return schoolDate;
	}
	public void setSchoolDate(Date schoolDate) {
		this.schoolDate = schoolDate;
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", address=" + address + ", tel=" + tel + ", schoolDate="
				+ schoolDate + "]";
	}

	
}
