package com.lf2a.aroundhandleexception;

import com.lf2a.aroundhandleexception.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AroundDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext((DemoConfig.class));

        TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        String data = trafficFortuneService.getFortune();
        System.out.println(data);

        context.close();
    }
}
