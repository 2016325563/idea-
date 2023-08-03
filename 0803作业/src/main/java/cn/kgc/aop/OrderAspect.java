package cn.kgc.aop;

import cn.kgc.entity.Order;
import cn.kgc.mapper.OrderMapper;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
@Aspect
public class OrderAspect {
    /*joinpoint是一个静态类吗*/

    Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    OrderMapper orderMapper;
    Order order = new Order();


    @Around(value = "execution(* cn.kgc.controller.*.*(..))")

    /*环绕通知的方法*/
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {
        /*调用的类的名字*/
        String methodName = proceedingJoinPoint.getSignature().getName();
        /*转换类路径为获取的路径得到*/
        String className = proceedingJoinPoint.getTarget().getClass().getName();
        /*转换结果数组为集合*/
        List<Object> args = Arrays.asList(proceedingJoinPoint.getArgs());
        /*获取了一个返回值 代理目标类方法调用*/
        Object result = null;
        try {
            /*请求目标类的返回值,代理了目标类的方法*/
            result = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        logger.debug("===========>调用了" + className + "类的" + methodName + "方法,参数是:" + args + "返回的结果是" + result);
        System.out.println("结束了环绕");

        return result;
    }

}