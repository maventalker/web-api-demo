package com.growithus.demo.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * ClassName:AuthorizationAspect <br/>
 * Function: 请求参数合法性验证<br/>
 * Date: 2018年10月16日 上午10:44:35 <br/>
 * 
 * @author guooo
 * @version
 * @since JDK 1.6
 * @see
 */
@Aspect
@Order(5)
@Component
public class AuthorizationAspect {
    private Logger logger = Logger.getLogger(AuthorizationAspect.class);

//    @Autowired
//    AuthorizeService authorizeService;

    @Pointcut("execution(public * com.growithus.controller.*.*.* (..))")
    public void authorizationAspect() {

    }

    @Around("authorizationAspect()")
    public String dobefore(ProceedingJoinPoint joinPoint) {
//        BizResult bizResult = new BizResult();
//        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
//        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
//        HttpServletRequest request = sra.getRequest();
//        try {
//            if (!authorizeService.argsCheck(request)) {
//                logger.warn("验签错误！");
//                bizResult.setReq(ReqResultCode.REQ_RESULT_CODE_ILLEGAL_SIGN);
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
}
