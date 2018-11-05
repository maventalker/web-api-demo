
package com.growithus.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName:RateLimiterAspect <br/>
 * Function: 接口限流<br/>
 * Date: 2018年10月16日 上午10:44:12 <br/>
 * 
 * @author guooo
 * @version
 * @since JDK 1.6
 * @see
 */
@Aspect
@Order(6)
@Component
public class RateLimiterAspect {
}
