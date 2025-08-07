package com.demo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Pointcut("execution(* add*(..))")
    private void forDaoPackage() {}

    @Pointcut("execution(* com.demo.aop.*.addAccount())")
    private void getter() {}

    // @Before("forDaoPackage() && !getter")
    // public void addbefore()
    // {
    //     System.out.println("\n===>logged successfully before adding account");
    // }

    @Before("forDaoPackage()")
    public void performApiAnalytics() {
        System.out.println("\n=====>>> Performing API analytics");
    }

}
