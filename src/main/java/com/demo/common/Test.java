package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            Addition add = (Addition) context.getBean("add");
            add.dosum();
        }catch(Exception exception){
            exception.printStackTrace();
        }
    }

}
