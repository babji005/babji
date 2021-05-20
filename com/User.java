package com;

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
		String email;
		String address;
		String phoneNumber;

		public User() {

		}

		public User(Integer userId, String username, String password,String email,String address,String phoneNumber) {
			this.userId = userId;
			this.username = username;
			this.password = password;
			this.email = email;
			this.address=address;
			this.phoneNumber=phoneNumber;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email =email;
		}

		
		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
					+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
		}
	}