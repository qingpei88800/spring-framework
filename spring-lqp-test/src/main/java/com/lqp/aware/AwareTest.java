package com.lqp.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

/**
 * Spring 的依赖注入最大亮点就是所有的 Bean 对 Spring 容器的存在是没有意识的，拿 Spring Bean 生命周期之“我从哪里来”？ 文章中“小学生入少先队”为例子说明，小学生还是那个小学生，加入少先队还是加入共青团只不过规则不一样罢了
 * 但是在实际项目中，我们不可避免的要用到 Spring 容器本身提供的资源（难免要有事情需要少先队组织的帮助），这时候要让 Bean 主动意识到 Spring 容器的存在，才能调用 Spring 所提供的资源，这就是 Spring Aware. 其实 Spring Aware 是 Spring 设计为框架内部使用的，若使用了，你的 Bean 将会和 Spring 框架耦合，所以自己不单独使用，但是在读框架源码时希望你不再模糊.
 *
 * @author liuqingpei
 * @Date 2020/11/19 10:37
 */
//@Component("awareTestBeanName")
public class AwareTest implements BeanNameAware, BeanFactoryAware {
	@Override
	public void setBeanName(String name) {
		System.out.println("设置beanName" + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("设置beanFactory" + beanFactory.toString());
	}
}
