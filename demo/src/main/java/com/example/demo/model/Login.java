package com.example.demo.model;

public class Login {

	private String user;
	private String password;
	public Login() {
		super();
	}
	public Login(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUsername(String username) {
		this.user = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
