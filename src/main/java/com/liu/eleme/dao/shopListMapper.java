package com.liu.eleme.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.liu.eleme.pojo.shopList;

@Mapper
public interface shopListMapper {

    List<shopList> selectShop();

}