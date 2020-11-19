package com.lqp;

import com.lqp.config.AppConfig;
import com.lqp.service.BeanLifeCycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liuqingpei
 * @Date 2020/11/18 16:59
 */
public class MyTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				ac
				= new AnnotationConfigApplicationContext(AppConfig.class);
		BeanLifeCycle bean = ac.getBean(BeanLifeCycle.class);
		System.out.println(bean);
		System.out.println("现在开始关闭容器！");
		ac.registerShutdownHook();
	}
}
