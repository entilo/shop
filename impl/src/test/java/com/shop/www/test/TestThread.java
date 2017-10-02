package com.shop.www.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.www.pojo.User;
import com.shop.www.webservice.UserService;
import com.shop.www.webservice.impl.ThreadOne;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:thread.xml", "classpath*:spring-anonation.xml" })
public class TestThread {
	@Autowired
	ThreadPoolTaskExecutor exc;
	@Inject
	UserService userService;

	@Test
	public void test() throws InterruptedException, ExecutionException {
		// exc.execute(new ThreadOne(2,userService));
		fun();
	}

	public void fun() throws InterruptedException, ExecutionException {
		List<Future<User>> taskResults = new ArrayList<Future<User>>();
		Future<User> f1 = exc.submit(new ThreadOne(1, userService));
		Future<User> f2 = exc.submit(new ThreadOne(2, userService));
		taskResults.add(f1);
		taskResults.add(f2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User us = null;
		try {
//			taskResults.get(0).get();
			us = taskResults.get(0).get(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {

		} catch (ExecutionException e) {

		} catch (TimeoutException e) {

		}

		System.out.println(us);

	}

}
