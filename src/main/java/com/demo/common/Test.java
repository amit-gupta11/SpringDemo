package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoConfig.xml");
     Employee employee1 =  context.getBean("employee1",Employee.class);
    System.out.println(employee1);
    }
}

