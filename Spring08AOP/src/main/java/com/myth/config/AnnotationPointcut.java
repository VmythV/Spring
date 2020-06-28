package com.myth.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import javax.xml.transform.Source;

/**
 * @author myth
 * @Date 2020-06-27 11:28
 */
@Aspect
public class AnnotationPointcut {
    @Before("execution(* com.myth.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======方法执行之前======");
    }

    @After("execution(* com.myth.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("======方法执行之后======");
    }

    @Around("execution(* com.myth.service.UserServiceImpl.*(..))")
    public void round(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("======环绕前======");

        //执行目标方法proceed
        Object proceed = pjp.proceed();

        System.out.println("======环绕后======");
    }
}
