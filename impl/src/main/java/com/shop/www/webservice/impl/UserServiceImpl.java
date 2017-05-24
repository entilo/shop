package com.shop.www.webservice.impl;


import com.shop.www.pojo.User;
import com.shop.www.webservice.UserService;


public class UserServiceImpl implements UserService {

	public User getUserBuId( Integer Id) {
		System.out.println("ids is" + Id);
		return new User();
	}

}
