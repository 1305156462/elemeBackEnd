package com.liu.eleme.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.liu.eleme.pojo.Cart;

@Mapper
public interface CartMapper {

//	void insert(@Param("userid") int userid,@Param("shopname") String shopname,@Param("foodname") String foodname,@Param("count") int count,@Param("price") float price,@Param("orderid") String orderid,@Param("time") String time);
	int insert(Cart cart);
	
	List<Cart> selectOrder(@Param("userid") int userid);
}