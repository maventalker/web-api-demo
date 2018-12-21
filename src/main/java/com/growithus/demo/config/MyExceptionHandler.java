/**
 * Project Name:web-api-demo
 * File Name:ExceptionHandler.java
 * Package Name:com.growithus.demo.config
 * Date:2018年12月19日下午9:41:29
 * Copyright (c) 2018, 杭州知时信息科技有限公司 All Rights Reserved.
 *
*/

package com.growithus.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alibaba.fastjson.JSONObject;

/**
 * ClassName:ExceptionHandler <br/>
 * Function: <br/>
 * Date:     2018年12月19日 下午9:41:29 <br/>
 * @author   apple
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@RestControllerAdvice
public class MyExceptionHandler {

    
    Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 1);
        jsonObject.put("errMsg", e.getMessage());
        return jsonObject.toJSONString();
    }
}

