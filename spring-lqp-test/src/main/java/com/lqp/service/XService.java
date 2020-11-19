package com.lqp.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liuqingpei
 * @Date 2020/11/18 17:11
 */
//@Scope("prototype")
//@Service
public class XService implements BeanNameAware, BeanFactoryAware {
	@Autowired
	private YService yService;

	public XService() {
		System.out.println("XService 构造");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("设置beanFactory ：" + beanFactory.toString());
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("设置BeanName ：" + name);
	}

//	@PostConstruct
//	private void init() {
//		System.out.println("@PostConstruct将在依赖注入完成后被自动调用: yService = " + yService);
//	}


}
