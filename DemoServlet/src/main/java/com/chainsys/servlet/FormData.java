package com.chainsys.servlet;

public class FormData {
	String name;
	String email;
	long phonenumber;
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FormData() {
	}

	public FormData(String name, String email, long phonenumber, int id) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.id = id;
	}

	@Override
	public String toString() {
		return "FormData [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + "]";
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

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}




}

