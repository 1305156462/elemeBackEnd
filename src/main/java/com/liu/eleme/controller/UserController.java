package com.liu.eleme.controller;

import java.io.FileOutputStream;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import java.io.IOException;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.liu.eleme.pojo.User;
import com.liu.eleme.service.UserService;

@RestController
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public User Login(@RequestBody JSONObject request) {		
		
		String username = request.getString("username");
		//MD5加密
		String password = request.getString("password");
		
		//System.out.println("username:"+username+"  password:"+password);
		
		User user = userService.tryLogin(username, password);
		
		if(user!=null){
			return user;
		}
		else{
			return null;
		}	
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public User Update(@RequestBody JSONObject request) {		
		
		int id = request.getInteger("id");
		
		User user = userService.selectUserMsg(id);
		
		System.out.println("user:"+user);
		
		if(user!=null){
			return user;
		}
		else{
			return null;
		}	
	}
	
	@RequestMapping(value = "/changename")
	public void changeName(HttpServletRequest request, HttpServletResponse response) {
		
		String username = request.getParameter("username");
		int id = Integer.parseInt(request.getParameter("id"));
		userService.changeName(username,id);
	}
	
	@RequestMapping(value = "/changephoto",method = RequestMethod.POST)
	public String changePhoto(@RequestParam("file") MultipartFile file, @RequestParam("id") int id,
    		@RequestParam("path") String path)throws IOException {
    	String fileName = file.getOriginalFilename();
    	System.out.println(fileName);
    	BASE64Encoder encoder = new BASE64Encoder();
        String imgData = encoder.encode(file.getBytes());
        
        JSONObject rspJson = new JSONObject();
        String photo = "/static/userphoto/" + fileName;
        userService.changePhoto(photo,id);

    	BASE64Decoder decoder = new BASE64Decoder();
        String filePath = path+fileName;
        System.out.println(filePath);
        byte[] b = decoder.decodeBuffer(imgData);
        for (int i = 0; i < b.length; ++i) {       	
        	if (b[i] < 0) {
        		b[i] += 256;
        	}
        }
        OutputStream out = new FileOutputStream(filePath);
        out.write(b);
        out.flush();
        out.close();
        rspJson.put("photopath", photo);
        return rspJson.toJSONString();
	}
}
	
	