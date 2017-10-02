package com.shop.www.dao;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.www.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-dao.xml")
public class UserMapperTest {

	@Autowired
	UserMapper userMapper;

	@Test
	public void testDeleteByPrimaryKey() {
		List<User> userList = new ArrayList<>();
		User user=new User();
		user.setId( 7);
		User user1=new User();
		user1.setId( 9);
		User user2=new User();
		user2.setId(10);
		userList.add(user);
		userList.add(user1);
		userList.add(user2);
		System.out.println(userMapper.getByList(userList));
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testInsertSelective() {
	}

	@Test
	public void testSelectAll() {
		List<User> userList = userMapper.selectAll();
		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
	}

	@Test
	public void testUpdateByPrimaryKey() {
	}

}
