package com.lqp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author liuqingpei
 * @Date 2020/11/18 17:11
 */
@Service("xService")
public class XService {

	public YService yService;

	public void test1() {
		System.out.println("test1");
	}

	public XService() {
		System.out.println("XService 构造");
	}

	public YService getyService() {
		return yService;
	}

	public void setyService(YService yService) {
		this.yService = yService;
	}

	@Autowired
	public XService(@Lazy YService yService) {
		System.out.println("XService 构造");
		this.yService = yService;
	}
}
