package org.example.config;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExamAspect {

    @Pointcut("execution(* org.example.dao.*.*(..))")
    public void pointCut() {

    }

    @Before("org.example.config.ExamAspect.pointCut()")
    public void before() {
        System.out.println("before-w");
    }

    @After("org.example.config.ExamAspect.pointCut()")
    public void after() {
        System.out.println("after-e");
    }

    @AfterThrowing("org.example.config.ExamAspect.pointCut()")
    public void doRecoveryActions() {
        //todo
        System.out.println("AfterThrowing");
    }



}
