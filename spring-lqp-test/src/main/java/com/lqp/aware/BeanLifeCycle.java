package com.lqp.aware;

import com.lqp.service.XService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * bean生命周期 演示
 *
 * @author liuqingpei
 * @Date 2020/11/19 14:19
 */
public class BeanLifeCycle implements BeanFactoryAware, BeanNameAware,
		InitializingBean, DisposableBean {

	private XService xService;
	private BeanFactory beanFactory;
	private String beanName;

	public BeanLifeCycle() {
		System.out.println("BeanLifeCycle构建");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()：" + this.beanName);
		this.beanFactory = arg0;
	}
	@Override
	public void setBeanName(String arg0) {
		System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()：" + arg0);
		this.beanName = arg0;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out
				.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet():" + this.beanName);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("【DiposibleBean接口】调用DiposibleBean.destory():" + this.beanName);
	}

	public void myInit() {
		System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法:" + this.beanName);
	}

	public void myDestory() {
		System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法:" + this.beanName);
	}

	@Autowired
	public void setxService(XService xService) {
		System.out.println("BeanLifeCycle属性XService 注入");
		this.xService = xService;
	}
}
