package com.liu.eleme.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.eleme.dao.UserMapper;
import com.liu.eleme.pojo.User;
import com.liu.eleme.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	public User tryLogin(String username, String password){
		return this.userMapper.selectByNamePwd(username,password);
	}
	
	public User selectUserMsg(int id) {
		return this.userMapper.selectById(id);
	}
	
	public void changeName(String username,int id) {
		this.userMapper.updateUsername(username,id);
	}
	
	public void changePhoto(String photo,int id) {
		this.userMapper.updatePhoto(photo,id);
	}
}