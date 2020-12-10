package com.lqp.service;

import org.springframework.stereotype.Service;

/**
 * @author liuqingpei
 * @Date 2020/11/18 17:11
 */
//@Scope("prototype")
@Service("xService")
public class XService {
//	@Autowired
//	private YService yService;
	
	public XService() {
		System.out.println("XService 构造");
	}


}
