package com.chainsys.pojo;

public class StudentInfo {

	private String name;
	private String department;
	private int regNo;
	private String location;

	public StudentInfo(String name,String department,int regNo,String location) {
		this.name=name;
		this.department=department;
		this.regNo=regNo;
		this.location=location;
	}



	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {

			if (name.matches("^[a-zA-Z ]+$")) {
				this.name = name;
			} else {
				System.out.println("Invalid name provided. Only letters and spaces are allowed.");
			}
		} else {
			System.out.println("Invalid name provided. Name cannot be null or empty.");
		}
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		if (department != null && !department.isEmpty()) {

			if (department.matches("^[a-zA-Z ]+$")) {
				this.department = department;
			} else {
				System.out.println("Invalid department provided. Only letters and spaces are allowed.");
			}
		} else {
			System.out.println("Invalid department provided. department cannot be null or empty.");
		}
	}
	public long getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", Department=" + department + ", regNo=" + regNo + ", location="
				+ location + "]";
	}





}
