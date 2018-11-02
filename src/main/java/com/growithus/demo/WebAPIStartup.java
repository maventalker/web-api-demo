package com.growithus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * 启动类
 * 
 * @author guooo 2018年11月2日 下午10:43:42
 * 
 */
@SpringBootApplication
@EnableDubbo
public class WebAPIStartup {

	public static void main(String[] args) {
		SpringApplication.run(WebAPIStartup.class, args);
	}

}
