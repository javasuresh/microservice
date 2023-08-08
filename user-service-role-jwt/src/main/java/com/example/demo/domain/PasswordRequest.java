package com.example.demo.domain;

public class PasswordRequest {
	
	private String email;
	private String newPassword;
	private String conformPassword;
	private String oldPassword;
	
	public PasswordRequest() {}
	
	public PasswordRequest(String email, String newPassword, String conformPassword, String oldPassword) {
		super();
		this.email = email;
		this.newPassword = newPassword;
		this.conformPassword = conformPassword;
		this.oldPassword = oldPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConformPassword() {
		return conformPassword;
	}
	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	
}
