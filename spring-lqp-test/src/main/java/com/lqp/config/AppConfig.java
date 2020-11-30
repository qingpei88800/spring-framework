package com.lqp.config;

import com.lqp.aware.BeanLifeCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuqingpei
 * @Date 2020/11/18 16:57
 */
@Configuration
@ComponentScan("com.lqp")
public class AppConfig {

	@Bean(name = "beanLifeCycle", initMethod = "myInit", destroyMethod = "myDestory")
	BeanLifeCycle getBeanLifeCycle() {
		return new BeanLifeCycle();
	}

//	@Bean(name = "person", initMethod = "init", destroyMethod = "destroyMethod")
//	Person getPerson() {
//		return new Person();
//	}

	public AppConfig() {
		System.out.println("AppConfig 构建");
	}
}
