package com.lf2a.afterthrowing.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopExpressions {
    @Pointcut("execution(* com.lf2a.afterthrowing.dao.*.*(..))")
    // vai executar todos os metodos de todas as classes do pacote "com.lf2a.aopdemo.dao" e que tenham quaisquer modificadores de acesso
    // e que possuem quaisquer parametros
    public void forDaoPackage() {
    }

    @Pointcut("execution(* com.lf2a.afterthrowing.dao.*.get*(..))")
    public void getter() {
    }

    @Pointcut("execution(* com.lf2a.afterthrowing.dao.*.set*(..))")
    public void setter() {
    }

    // incluindo forDaoPackage() e excluindo getter() e setter()
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {
    }
}
