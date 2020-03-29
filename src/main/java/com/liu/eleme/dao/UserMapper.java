package com.liu.eleme.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.liu.eleme.pojo.User;

@Mapper
public interface UserMapper {

	User selectByNamePwd(@Param("username") String username, @Param("password") String password);
	
	User selectById(@Param("id") int id);
	
	void updateUsername(@Param("username") String username, @Param("id") int id);
	
	void updatePhoto(@Param("photo") String photo, @Param("id") int id);
}
