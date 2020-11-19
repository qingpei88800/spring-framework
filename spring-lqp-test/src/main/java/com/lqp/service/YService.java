package com.lqp.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liuqingpei
 * @Date 2020/11/18 17:11
 */
//@Scope("prototype")
//@Service
public class YService {

	@Autowired
	private XService xService;

	public YService() {
		System.out.println("YService 构造");
	}
}
