package com.test.www.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented   
@Retention(RetentionPolicy.RUNTIME)   
@Target({ElementType.TYPE,ElementType.METHOD}) 
public @interface TTAnotation {

	String time() default "time";   
    String value() default "defauleVaule"; 
}
