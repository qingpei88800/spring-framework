package com.lqp.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author liuqingpei
 * @Date 2020/11/19 19:42
 */
public class Person implements BeanFactoryAware, BeanNameAware,
		InitializingBean, DisposableBean {
	private String name;

	public Person() {
		System.out.println("Constructor of person bean is invoked!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory method of person is invoked");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName method of person is invoked");
	}

	public void init() {
		System.out.println("custom init method of person bean is invoked!");
	}

	//Bean initialization code  equals to
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method of person bean is invoked!");
	}

	//Bean destruction code
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean Destroy method of person bean is invoked!");
	}

	public void destroyMethod() {
		System.out.println("custom Destroy method of person bean is invoked!");
	}


}
