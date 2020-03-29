package com.liu.eleme.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.liu.eleme.pojo.shopList;
import com.liu.eleme.service.shopListService;

@RestController
public class shopListController {

	@Resource
	private shopListService shoplistService;
	

	@RequestMapping(value = "/getshoplist",method = RequestMethod.GET)
	public List getFoodList(HttpServletRequest request, HttpServletResponse response) {
		
		List<shopList> shoplist = shoplistService.selectShopList();
		
		
		if(shoplist!=null){
			return shoplist;
		}
		return null;
	}
	
}
