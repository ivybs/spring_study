package com.ibs.diy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 方式三：使用注解方式，实现aop
@Aspect //标注这个类是一个切面
public class AnnotationPointCut {


    @Before("execution(* com.ibs.service.UserServiceImp.*(..))")
    public void before(){
        System.out.println("==============方法开始之前================");
    }
    @After("execution(* com.ibs.service.UserServiceImp.*(..))")
    public void after(){
        System.out.println("===============方法开始之后===============");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要处理切入的点ProceedingJoinPoint,和切入点一样
    // 但是能从切入点拿到东西
    @Around("execution(* com.ibs.service.UserServiceImp.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("========环绕前========");
        System.out.println("signature" + joinPoint.getSignature().toString());
        joinPoint.proceed();
        System.out.println("========环绕后========");
    }
}
