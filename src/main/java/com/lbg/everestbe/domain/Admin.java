//package com.lbg.everestbe.domain;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//public class Admin {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	@Column(nullable = false)
//	private String username;
//	@Column(nullable = false)
//	private String password;
//
//	public Admin() {
//
//	}
//
//	public Admin(Integer id, String username, String password) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.password = password;
//	}
//
//	public Admin(String username, String password) {
//		super();
//		this.username = username;
//		this.password = password;
//	}
//
//	public Admin(Integer id) {
//		super();
//		this.id = id;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	@Override
//	public String toString() {
//		return "Admin: id=" + id + ", username=" + username + ", password=" + password;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Admin other = (Admin) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (username == null) {
//			if (other.username != null)
//				return false;
//		} else if (!username.equals(other.username))
//			return false;
//		if (password == null) {
//			if (other.password != null)
//				return false;
//		} else if (!password.equals(other.password))
//			return false;
//		return true;
//	}
//
//}
