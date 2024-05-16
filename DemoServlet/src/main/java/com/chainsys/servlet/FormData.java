package com.chainsys.servlet;

public class FormData {
	String name;
	String email;
	String dob;
	String password;


	public FormData() {
	}

	public FormData(String name, String email, String dob, String password) {
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.password = password;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "FormData [name=" + name + ", email=" + email + ", dob=" + dob + ", password=" + password + "]";
	}
}

