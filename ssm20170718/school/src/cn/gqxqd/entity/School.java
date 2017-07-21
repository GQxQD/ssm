package cn.gqxqd.entity;

import java.util.Date;

public class School {

	private Integer id;
	private String name;
	private String president;
	private String address;
	private String tel;
	private String email;
	private Boolean status;
	private Date schoolDate;

	public School(Integer id, String name, String president, String address, String tel, String email, Boolean status,
			Date schoolDate) {
		super();
		this.id = id;
		this.name = name;
		this.president = president;
		this.address = address;
		this.tel = tel;
		this.email = email;
		this.status = status;
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

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getSchoolDate() {
		return schoolDate;
	}

	public void setSchoolDate(Date schoolDate) {
		this.schoolDate = schoolDate;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", president=" + president + ", address=" + address + ", tel="
				+ tel + ", email=" + email + ", status=" + status + ", schoolDate=" + schoolDate + "]";
	}

}
