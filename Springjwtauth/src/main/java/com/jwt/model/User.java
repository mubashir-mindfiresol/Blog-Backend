package com.jwt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String email;
	private String username;
	private String password;
	private boolean enabled;
	private String role;
	public User() {}
	public User(Long id, String email, String password,String role,String username,boolean enabled) {
		Id = id;
		this.email = email;
		this.password = password;
		this.role=role;
		this.enabled=enabled;
		this.username=username;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
	public String getRole() {
		return role;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", email=" + email + ", password=" + password + ",username =\" + username + \", role=" + role + ",enabled=" + enabled + "]";
	}
	

}
