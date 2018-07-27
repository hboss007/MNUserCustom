package com.sanyang.demo.util;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.weaver.loadtime.definition.Definition.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class UserAscept {

	
	@Before("execution(* com.sanyang.demo.dao.HangxianDaoImp.queryHx(..))")
	public void before(){
		System.out.println("请求方法前对方法进行拦截！~~~");
	}
	
	@AfterReturning(value="execution (* com.sanyang.demo.dao.**.*(..))",returning="result")
	public void afterrunning(JoinPoint jp,Object result){
		String mn = jp.getSignature().getName();
		System.out.println(mn+"return："+result);
	}
}
