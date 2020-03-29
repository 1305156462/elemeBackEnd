package com.liu.eleme.service;

import java.util.List;

import com.liu.eleme.pojo.Cart;

public interface CartService {

//	public void insertOrder(int userid,String shopname,String foodname,int count,float price,String orderid,String time);
	public int insertOrder(Cart cart);
	public List<Cart> selectByUserid(int userid);
}
