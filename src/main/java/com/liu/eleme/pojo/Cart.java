package com.liu.eleme.pojo;

import java.util.Date;

public class Cart {

	private int id;
	private int userid;
	private String shopname;
	private String foodname;
	private int count;
	private Float price;
	private String orderid;
	private Date createtime;
	private String shopphoto;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname == null ? null : shopname.trim();
	}
	
	public String getShopphoto() {
		return shopphoto;
	}

	public void setShopphoto(String shopphoto) {
		this.shopphoto = shopphoto;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname == null ? null : foodname.trim();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid == null ? null : orderid.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
