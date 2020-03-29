package com.liu.eleme.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liu.eleme.pojo.Cart;
import com.liu.eleme.service.CartService;

@RestController
public class CartController {

	@Resource
	private CartService cartService;
	
	public static String getOrderIdByUUId() {
		int machineId = 1;//最大支持1-9个集群机器部署
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if(hashCodeV < 0) {//有可能是负数
		hashCodeV = - hashCodeV;
		}
				//         0 代表前面补充0     
				//         4 代表长度为4     
				//         d 代表参数为正数型
		return machineId+ String.format("%015d", hashCodeV);
		}
	
	@RequestMapping(value = "/order",method = RequestMethod.POST)
	public String Order(@RequestBody JSONObject request) {
		int userid = request.getInteger("userid");
		System.out.println("userid:" + userid);
		JSONArray cartlist = request.getJSONArray("cartlist");
		System.out.println(cartlist);
		String shopname = request.getString("shopname");
		String shopphoto = request.getString("shopphoto");
		String orderid=getOrderIdByUUId();
		
		int flag=0,i=0;
		Cart cart = new Cart();
		for ( i=0 ; i < cartlist.size(); i++) {     //遍历json数组内容
		    JSONObject object = cartlist.getJSONObject(i);
		    System.out.println(object.getString("foodname")); 
		    
			cart.setUserid(userid);
			cart.setShopname(shopname);
			cart.setShopphoto(shopphoto);
			cart.setFoodname(object.getString("foodname"));
			cart.setCount(object.getInteger("count"));
			cart.setPrice(object.getFloat("price"));
			cart.setOrderid(orderid);
			System.out.println("orderid:" + orderid );
			cart.setCreatetime(new Date());
			cartService.insertOrder(cart);
		}
		if(i==cartlist.size()) {flag=1;}
		if(flag == 1) {
			System.out.println("插入订单成功");
			return "插入订单成功";
		}else {
			System.out.println("插入订单失败");
			return "插入订单失败";
		}
	}
	
	@RequestMapping(value = "/getorder",method = RequestMethod.GET)
	public String getOrder(HttpServletRequest request, HttpServletResponse response) {
		int userid=Integer.parseInt(request.getParameter("userid"));
		List<Cart> order=cartService.selectByUserid(userid);
		System.out.println("order:"+order.get(0).getCreatetime());
		JSONObject rspJson =new JSONObject();
		rspJson.put("data", order);
		return rspJson.toJSONString();
	}
}
