package com.demo.common;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Pepsi pepsi1 =(Pepsi) context.getBean("pepsi1");
        System.out.println(pepsi1);
        context.registerShutdownHook();
    }
}

