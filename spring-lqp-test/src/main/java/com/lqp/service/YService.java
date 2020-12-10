package com.lqp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuqingpei
 * @Date 2020/11/18 17:11
 */
//@Scope("prototype")
//@Service("yService")
public class YService {

	@Autowired
	private XService xService;

	public YService() {
		System.out.println("YService 构造");
	}
}
