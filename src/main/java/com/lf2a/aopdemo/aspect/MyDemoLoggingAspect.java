package com.lf2a.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//    @Before("execution(public void addAccount())")
//    public void beforeAddAccountAdvice() {
//        System.out.println("==========>>> Executing @Before advice on method");
//    }

//    @Before("execution(public void com.lf2a.aopdemo.dao.MembershipDAO.addAccount())")
//    // vai executar quando MembershipDAO.addAccount() for executado
//    public void beforeAddAccountAdviceMembership() {
//        System.out.println("==========>>> Executing @Before Membership advice on method");
//    }

//    @Before("execution(public void add*())")
//    // vai executar todos os metodos que comecam com "add"
//    public void beforeAddAccountAdvice() {
//        System.out.println("==========>>> Executing @Before Membership advice on method");
//    }

    @Before("execution(void add*())")
    // vai executar todos os metodos que comecam com "add" e tenham quaisquer modificadores de acesso
    public void beforeAddAccountAdvice() {
        System.out.println("==========>>> Executing @Before Membership advice on method");
    }
}
