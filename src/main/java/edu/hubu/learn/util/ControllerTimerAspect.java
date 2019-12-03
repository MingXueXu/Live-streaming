package edu.hubu.learn.util;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

/**
 * @moduleName: ControllerTimerAspect
 * @description: 切面，记录所有 Service 层的方法调用的时间与运行消耗的时间。
 *
 * @author: 杨睿
 * @since: 2019-12-03 17:25
 */
@Aspect
@Component
@Slf4j
public class ControllerTimerAspect {

    @Pointcut("execution(public * edu.hubu.learn.web.common.BaseService.*(..))")
    public void baseServicePointCut() {
    }

    @Pointcut("execution(public * edu.hubu.learn.web.service.*.*(..))")
    public void servicePointCut() {
    }

    @Around("baseServicePointCut()")
    public Object baseAround(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object result = point.proceed();
        long time = System.currentTimeMillis() - beginTime;
        logCostTime(point, time);
        return result;
    }

    @Around("servicePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object result = point.proceed();
        long time = System.currentTimeMillis() - beginTime;
        logCostTime(point, time);
        return result;
    }

    private void logCostTime(ProceedingJoinPoint joinPoint, long time) {
        Signature signature = joinPoint.getSignature();
        log.info("method: " + signature.toString() + " cost:" + time + "ms");
    }
}