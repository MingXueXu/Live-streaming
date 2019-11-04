package edu.hubu.learn.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Aspect
@Component
@Log
public class ControllerTimer {

    @Pointcut("execution(public * edu.hubu.learn.web.*.*(..))")
    public void controllerPointCut() {
    }

    @Around("controllerPointCut()")
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