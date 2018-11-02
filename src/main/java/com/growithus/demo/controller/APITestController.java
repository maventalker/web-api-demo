package com.growithus.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * test controller
 * 
 * @author guooo 2018年10月25日 下午1:49:57
 * 
 */
@RestController
public class APITestController {

	/*@Reference(version = "${service.version}", mock = "true")
	private DemoService demoService;

	*//**
	 * 调用后端dubbo服务
	 * 
	 * @param input
	 * @return
	 *//*
	@RequestMapping(value = "rand", method = RequestMethod.POST)
	public String get(String input) {
		return demoService.hello("demo");
	}*/
	
	@RequestMapping(value = "getActDtl",method = RequestMethod.POST)
	public String getAccountDetail(String tid) {
		return "hello detail";
	}
}
