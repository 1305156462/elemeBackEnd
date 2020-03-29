package com.liu.eleme.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.liu.eleme.pojo.foodList;

@Mapper
public interface foodListMapper {

	List<foodList> foundByShopname(@Param("shopname") String shopname);
	
}