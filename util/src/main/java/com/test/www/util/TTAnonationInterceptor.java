package com.test.www.util;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.ClassUtils;

public class TTAnonationInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		Method method=ClassUtils.getMostSpecificMethod(invocation.getMethod(),invocation.getThis().getClass());
		TTAnotation ttAnonation=method.getAnnotation(TTAnotation.class);
		System.out.println("time is:"+ttAnonation.time()+""+"\nvalue is:"+ttAnonation.value());
		// 继续执行之后的流程
		Object result = invocation.proceed();
		return result;
	}


}
