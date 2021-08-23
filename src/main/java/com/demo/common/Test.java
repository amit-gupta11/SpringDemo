package com.demo.common;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
        public static void main(String[] args){
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            context.registerShutdownHook();
            Juice juice1 = (Juice) context.getBean("juice1") ;
            System.out.println(juice1);
        }
    }

