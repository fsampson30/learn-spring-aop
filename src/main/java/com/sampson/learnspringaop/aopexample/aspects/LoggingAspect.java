package com.sampson.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("com.sampson.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()")
    public void logMethodCall(JoinPoint joinPoint) {
        logger.info("Before Aspect - Method is called - {}", joinPoint);
    }

    @After("com.sampson.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()")
    public void logMethodCallAfterExecution(JoinPoint joinPoint) {
        logger.info("After Aspect - has executed - {}", joinPoint);
    }

    @AfterThrowing(value = "com.sampson.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()", throwing = "exception")
    public void logMethodCallAfterThrowing(JoinPoint joinPoint, Exception exception) {
        logger.info("After Throwing Aspect - {} - has executed - {}", joinPoint, exception);
    }

    @AfterReturning(pointcut = "com.sampson.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()", returning = "resultValue")
    public void logMethodCallAfterReturning(JoinPoint joinPoint, Object resultValue) {
        logger.info("After Throwing Aspect -{} - has executed - {}", joinPoint, resultValue);
    }
}
