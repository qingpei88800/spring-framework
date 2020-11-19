package com.lqp.config;

import com.lqp.service.BeanLifeCycle;
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

	@Bean(initMethod = "myInit", destroyMethod = "myDestory")
	BeanLifeCycle getBeanLifeCycle() {
		return new BeanLifeCycle();
	}
}
