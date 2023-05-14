package com;

public class User1 {
	String name;
	String username;
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User1(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User1 [name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	

}
