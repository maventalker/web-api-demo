
package com.growithus.demo.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName:WhitelistAspect <br/>
 * Function: 白名单限制<br/>
 * Date: 2018年10月16日 上午10:43:48 <br/>
 * 
 * @author guooo 公众号：growithus
 * @version
 * @since JDK 1.6
 * @see
 */
@Aspect
@Component
@Order(2)
public class WhitelistAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

//    @Autowired
//    RedisSpecCacheService redisSpecCacheService;

//    @Autowired
//    AuthorizeService authorizeService;

    @Pointcut("execution(public * com.growithus.demo.controller.*.*.* (..))")
    public void whitelistAspect() {

    }

    /**
     * 
     * dobefore:IP白名单验证 <br/>
     *
     * @author pan
     * @param joinPoint
     * @since JDK 1.6
     */
    @Around("whitelistAspect()")
    public String dobefore(ProceedingJoinPoint joinPoint) {
//        BizResult bizResult = new BizResult();
//        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
//        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
//        HttpServletRequest request = sra.getRequest();
//        String ip = getIpAddr(request);
//        if (DataUtil.isEmpty(ip)) {
//            logger.warn("==============>无法获取用户请求IP地址<===============");
//            bizResult.setReq(ReqResultCode.REQ_RESULT_CODE_ILLEGAL_IP_UNKNOW);
//        }
//        try {
//            if (!authorizeService.whiteIPCheck(request, ip)) {
//                logger.warn("非法请求，来源地址：" + ip + ";请求URI：" + request.getRequestURI());
//                bizResult.setReq(ReqResultCode.REQ_RESULT_CODE_ILLEGAL_IP);
//            } else {
//                try {
//                    return (BizResult) joinPoint.proceed();
//                } catch (Throwable e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (BusinessException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    /**
     * getIpAddr: 防止添加代理的情况下，依旧过去获取真实IP地址<br/>
     *
     * @author guooo Date:2016年12月28日上午11:14:44
     * @param request
     * @return
     * @since JDK 1.6
     */
    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        //多级反向代理的话，X-Forwarded-For的值并不止一个
        if (ip.split(",").length > 1) {
            ip = ip.split(",")[0];
        }
        return ip;
    }
}
