package com.shop.www.webservice.impl;

import org.springframework.stereotype.Service;

import com.shop.www.pojo.User;
import com.shop.www.webservice.UserService;
import com.test.www.util.TTAnotation;

@Service("userService")
public class UserServiceImpl implements UserService {

	@TTAnotation(time = " anonation time ", value = "anonation value")
	public User getUserBuId(Integer Id) {
		System.out.println("ids is" + Id);
		User user = new User();
		user.setEmail("email");
		user.setUsername("userName");
		user.setId(Id);
		return user;
	}
}
