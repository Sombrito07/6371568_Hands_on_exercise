package com.cognizant.springcore.SpringCoreBasicApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.sayHello();
    }
}
