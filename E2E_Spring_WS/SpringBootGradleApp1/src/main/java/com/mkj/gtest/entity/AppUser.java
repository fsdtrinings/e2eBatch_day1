package com.mkj.gtest.entity;

import java.util.List;


import org.springframework.stereotype.Component;


@Component
public class AppUser {

	private String username;
	private String password;
	private String role;
	private List<AppUser> connection; // linkedIn
	
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppUser(String username, String password, String role, List<AppUser> connection) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.connection = connection;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<AppUser> getConnection() {
		return connection;
	}

	public void setConnection(List<AppUser> connection) {
		this.connection = connection;
	}

	@Override
	public String toString() {
		return "AppUser [username=" + username + ", password=" + password + ", role=" + role + ", connection="
				+ connection + "]";
	}
	
	
}
