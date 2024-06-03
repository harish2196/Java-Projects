package com.chainsys.demo;

public class User {
	
	int id;
	public String name;
	public String email;
	public String password;
	public String mobile;
	public String empCode;
	String toDate;
	String fromDate;
	String leaveType;
	String reason;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public User(int id, String name, String email, String password, String mobile, String empCode, String toDate,
			String fromDate, String leaveType, String reason) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.empCode = empCode;
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.leaveType = leaveType;
		this.reason = reason;
	}
	public User() {
		// TODO Auto-generated constructor stub
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getToDate() {
		return toDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", mobile="
				+ mobile + ", empCode=" + empCode + ", toDate=" + toDate + ", fromDate=" + fromDate + ", leaveType="
				+ leaveType + ", reason=" + reason + "]";
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}