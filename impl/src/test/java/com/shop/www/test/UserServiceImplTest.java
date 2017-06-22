package com.shop.www.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.www.webservice.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-anonation.xml")
public class UserServiceImplTest {

	@Inject
	UserService userService;
	@Test
	public void testGetUserBuId() {
		userService.getUserBuId(1);
	}
}
