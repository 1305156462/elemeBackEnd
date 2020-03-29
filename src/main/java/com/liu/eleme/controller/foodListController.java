package com.liu.eleme.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.liu.eleme.pojo.foodList;
import com.liu.eleme.service.foodListService;

@RestController
public class foodListController {

	@Resource
	private foodListService foodlistService;
	

	@RequestMapping(value = "/getfoodlist",method = RequestMethod.GET)
	public List<foodList> getFoodList(HttpServletRequest request, HttpServletResponse response) {
		// 此处默认有值
		String shopname = request.getParameter("shopname");
		
		List<foodList> foodlist = foodlistService.foundFoodList(shopname);
		System.out.println(shopname);
		
		if(foodlist!=null){
			return foodlist;
		}
		return null;
	}
	
}
