package com.example.boycott.Configs;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j

public class LoggingAspects {

    @Before("execution(* com.example.boycott.Services.*.*(..))")
    public void logMethodEntryBef(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Bienvenue " + " : " + name );
    }

}
