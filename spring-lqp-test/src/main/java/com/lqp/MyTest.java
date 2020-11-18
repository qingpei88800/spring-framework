package com.lqp;

import com.lqp.config.AppConfig;
import com.lqp.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liuqingpei
 * @Description TODO
 * @Date 2020/11/18 16:59
 */
public class MyTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				ac
				= new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(IndexService.class));
	}
}
