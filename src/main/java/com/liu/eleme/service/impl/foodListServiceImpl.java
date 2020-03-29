package com.liu.eleme.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.eleme.dao.foodListMapper;
import com.liu.eleme.pojo.foodList;
import com.liu.eleme.service.foodListService;

@Service
public class foodListServiceImpl implements foodListService {
	
	@Resource
	private foodListMapper foodlistMapper;
	
	public List<foodList> foundFoodList(String shopname){
		return this.foodlistMapper.foundByShopname(shopname);
	}

}
