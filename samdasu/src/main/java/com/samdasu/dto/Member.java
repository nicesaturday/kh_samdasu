package com.samdasu.dto;

public class Member {
	private int num;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	private String resdate;
	public Member() {}
	public Member(int num, String id, String pw, String name, String email, String address, String resdate) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address = address;
		this.resdate = resdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	@Override
	public String toString() {
		return "Member [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", address="
				+ address + ", resdate=" + resdate + "]";
	}
	
	
	
	
}
