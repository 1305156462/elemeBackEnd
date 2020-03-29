package com.liu.eleme.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.eleme.dao.CartMapper;
import com.liu.eleme.pojo.Cart;
import com.liu.eleme.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Resource
	private CartMapper cartMapper;
	
//	public void insertOrder(int userid,String shopname,String foodname,int count,float price,String orderid,String time){
//		this.cartMapper.insert(userid,shopname,foodname,count,price,orderid,time);
//	}
	
	public int insertOrder(Cart cart){
	    return this.cartMapper.insert(cart);
    }
	
	public List<Cart> selectByUserid(int userid) {
		System.out.println("select:" + this.cartMapper.selectOrder(userid));
		return this.cartMapper.selectOrder(userid);
	}
}
