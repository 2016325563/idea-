package cn.kgc.aop;

import cn.kgc.controller.ProductController;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProductAspect {
    Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    ProductController productController;

    // 在切点前后执行自定义的逻辑
    /*注意一定要有value这个前缀啊*/
    @Around(value = "execution(* cn.kgc.controller.*.*(..))")
    public Object productaop(ProceedingJoinPoint joinPoint) {
        // 在目标方法执行前做一些操作，例如记录日志
        logger.debug("执行之前的:" + joinPoint.getSignature().getName());

        Object result = null;
        try {
            // 调用 proceed() 方法执行目标方法
            result = joinPoint.proceed();
        } catch (Throwable e) {
            // 在目标方法抛出异常时做一些操作，例如处理异常或者回滚事务
            logger.debug("执行中: " + e.getMessage());
        }

        // 在目标方法执行后做一些操作，例如记录日志或者返回结果
        logger.debug("执行后:" + joinPoint.getSignature().getName());
        return result;
    }
}




