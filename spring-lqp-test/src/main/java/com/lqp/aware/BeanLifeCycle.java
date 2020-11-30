package com.lqp.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * bean生命周期 演示
 *
 * @author liuqingpei
 * @Date 2020/11/19 14:19
 */
//@Component
public class BeanLifeCycle implements BeanFactoryAware, BeanNameAware,
		InitializingBean, DisposableBean {

	private BeanFactory beanFactory;

	private String beanName;

	public BeanLifeCycle() {
		System.out.println("BeanLifeCycle构建");
	}

	/**
	 * 这是BeanFactoryAware接口方法
	 *
	 * @param arg0
	 * @throws BeansException
	 */
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
		this.beanFactory = arg0;
	}

	/**
	 * 这是BeanNameAware接口方法
	 */
	@Override
	public void setBeanName(String arg0) {
		System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()：" + arg0);
		this.beanName = arg0;
	}

	/**
	 * 这是InitializingBean接口方法
	 *
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out
				.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
	}

	/**
	 * 这是DiposibleBean接口方法
	 *
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
	}

	/**
	 * 通过<bean>的init-method属性指定的初始化方法
	 */
	public void myInit() {
		System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
	}

	/**
	 * 通过<bean>的destroy-method属性指定的初始化方法
	 */

	public void myDestory() {
		System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
	}

}
