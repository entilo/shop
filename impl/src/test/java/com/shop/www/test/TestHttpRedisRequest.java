package com.shop.www.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestHttpRedisRequest {
	@Test
	public void test() {
		Jedis test = new Jedis("192.168.233.128",6379);  
		test.auth("entilo"); 
        test.set("hw","hello world");  
        String hello = test.get("hw");  
        System.out.println(hello); 
	}
}
