package com.shop.www.webservice.impl;



import java.util.concurrent.Callable;

import com.shop.www.pojo.User;
import com.shop.www.webservice.UserService;

public class ThreadOne implements  Callable<User> {
	private Integer id;
	private UserService userService;

	
	public ThreadOne(Integer id, UserService userService) {
		this.id = id;
		this.userService = userService;
	}

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public User call() throws Exception {
		// TODO Auto-generated method stub
		return userService.getUserBuId(id);
	}
	

}
