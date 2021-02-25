package com.lqp;

import com.lqp.service.XService;
import com.lqp.service.YService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuqingpei
 * @Date 2020/11/18 16:59
 */
public class MyTest {
	public static void main(String[] args) {
		//注解方式启动
//		AnnotationConfigApplicationContext
//				ac
//				= new AnnotationConfigApplicationContext(AppConfig.class);
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		BeanLifeCycle bean = ac.getBean(BeanLifeCycle.class);
		XService xService = ac.getBean(XService.class);
		xService.test1();
		YService yService = ac.getBean(YService.class);
		System.out.println("x==y:" + (xService.yService == yService));
		yService.test1();
		xService.getyService().test1();
		YService yService1 = xService.getyService();
		yService1.test1();
		YService yService2 = xService.getyService();
		yService2.test1();
		System.out.println(yService1 == yService2);
		System.out.println("x==y:" + (yService1 == yService));
		System.out.println("现在开始关闭容器！");
		ac.registerShutdownHook();

	}
}
