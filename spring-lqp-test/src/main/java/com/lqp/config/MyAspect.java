package com.lqp.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author liuqingpei
 */
@Aspect
@Component
public class MyAspect {
	/**
	 * 前置通知
	 *
	 * @param joinPoint 该参数可以获取目标对象的信息,如类名称,方法参数,方法名称等
	 */
	@Before("execution(* com.lqp.service.XService.test1(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("我是前置通知");
	}
}
