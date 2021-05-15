package com.postbook;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer userId;
	@Column(unique = true)
	String username;
	String password;
	String name;

	public User() {

	}

	public User(Integer userId, String username, String password, String name) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Post [userId=" + userId + ", username=" + username + ", password=" + password + ", name=" + name + "]";
	}

}
