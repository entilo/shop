package com.shop.www.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestHttpRedisRequest {
	@Test
	public void test() {
		Jedis test = new Jedis("192.168.233.129",6379);  
		test.auth("entilo"); 
        test.set("hw","hello world");  
        String hello = test.get("hw");  
        System.out.println(hello); 
	}
	@Test
	public void test0() {
		Jedis test = new Jedis("192.168.233.129",6380);  
		test.auth("entilo"); 
        test.set("hw","hello world");  
        String hello = test.get("hw");  
        System.out.println(hello); 
	}
	@Test
	public void test1() {
		Jedis test = new Jedis("192.168.233.129",6381);  
		test.auth("entilo"); 
        test.set("hw","hello world");  
        String hello = test.get("hw");  
        System.out.println(hello); 
	}
	@Test
	public void test2() {
		Jedis test = new Jedis("192.168.233.129",6382);  
		test.auth("entilo"); 
        test.set("hw","hello world");  
        String hello = test.get("hw");  
        System.out.println(hello); 
	}
	@Test
	public void test3() {
		Jedis test = new Jedis("192.168.233.129",6383);  
		test.auth("entilo"); 
        test.set("hw","hello world");  
        String hello = test.get("hw");  
        System.out.println(hello); 
	}
	@Test
	public void test4() {
		Jedis test = new Jedis("192.168.233.129",6384);  
		test.auth("entilo"); 
        test.set("hw","hello world");  
        String hello = test.get("hw");  
        System.out.println(hello); 
	}

}
