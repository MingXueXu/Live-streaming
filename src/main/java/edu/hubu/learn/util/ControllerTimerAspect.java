package edu.hubu.learn.util;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

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