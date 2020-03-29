package com.liu.eleme.pojo;

public class foodList {

	private int id;
	private String shopname;
	private String classification;
	private String foodname;
	private float price;
	private String imgurl;
//	private int count;

	public int getId() {
		return id;
	}
	
//	public int getcount() {
//		return count;
//	}

	public String getShopname() {
		return shopname;
	}
	
	public String getClassification() {
		return classification;
	}
	
	public String getFoodname() {
		return foodname;
	}

	public float getPrice() {
		return price;
	}
	
	public String getImgurl() {
		return imgurl;
	}

	public void setId(int id) {
		this.id = id;
	}
	
//	public void setcount(int count) {
//		this.count = count;
//	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	
	public void setClassification(String classification) {
		this.classification = classification;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
}
