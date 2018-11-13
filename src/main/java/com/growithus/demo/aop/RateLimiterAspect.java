
package com.growithus.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName:RateLimiterAspect <br/>
 * Function: 接口限流<br/>
 * Date: 2018年10月16日 上午10:44:12 <br/>
 * 
 * @author guooo 公众号：growithus
 * @version
 * @since JDK 1.6
 * @see
 */
@Aspect
@Order(6)
@Component
public class RateLimiterAspect {
	/**
	 * 思路：结合redis，将每个接口作为key存进去，进行自增操作，自定个时间间隔作为数据的有效时限，时间间隔内达到数量上限，即不受理接口请求。
	 */
}
