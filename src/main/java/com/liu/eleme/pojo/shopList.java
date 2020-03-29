package com.liu.eleme.pojo;

public class shopList {
    private Integer id;

    private String shopname;

    private String shopphoto;

    private String stars;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        this.shopphoto = shopphoto == null ? null : shopphoto.trim();
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars == null ? null : stars.trim();
    }
}