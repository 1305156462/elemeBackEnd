package com.liu.eleme.pojo;

public class User {
	private int id;
	private String photo;
	private String username;
	private String password;

	public int getId() {
		return id;
	}
	
	public String getPhoto() {
		return photo;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
