package com.sampson.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class CommonPointcutConfig {

    @Pointcut("execution(* com.sampson.learnspringaop.aopexample.business.*.*(..))")
    public void businessPackageConfig(){}

    @Pointcut("execution(* com.sampson.learnspringaop.aopexample.data.*.*(..))")
    public void dataPackageConfig(){}




}
