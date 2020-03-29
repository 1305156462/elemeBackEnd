package com.liu.eleme.service;

import com.liu.eleme.pojo.User;

public interface UserService {

	public User tryLogin(String username, String password);
	
	public User selectUserMsg(int id);
	
	public void changeName(String username,int id);
	
	public void changePhoto(String photo,int id);
}
