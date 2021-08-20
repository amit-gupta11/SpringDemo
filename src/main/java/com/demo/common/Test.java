package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class Test {
        public static void main(String[] args) {
            try {
                ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
                Employee employee1 = (Employee) context.getBean("employee1");
                System.out.println(employee1);
            }catch(Exception exception){
                exception.printStackTrace();
            }
        }
    }

