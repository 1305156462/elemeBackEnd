package com.liu.eleme.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.eleme.dao.shopListMapper;
import com.liu.eleme.pojo.shopList;
import com.liu.eleme.service.shopListService;

@Service
public class shopListServiceImpl implements shopListService {

	@Resource
	private shopListMapper shoplistMapper;
	
	public List<shopList> selectShopList(){
		return this.shoplistMapper.selectShop();
	}
	
}
