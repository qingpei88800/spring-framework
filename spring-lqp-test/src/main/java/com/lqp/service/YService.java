package com.lqp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuqingpei
 * @Date 2020/11/18 17:11
 */
@Service("yService")
public class YService {

	private XService xService;

	public void test1() {
		System.out.println("test1");
	}

	public YService() {
		System.out.println("YService 构造");
	}

	@Autowired()
	public YService(XService xService) {
		System.out.println("YService 构造");
		this.xService = xService;
	}
}
