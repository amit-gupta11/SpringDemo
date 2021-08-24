package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            Person person1 = (Person) context.getBean("person1",Person.class);
            System.out.println(person1);
            System.out.println(person1.getFriends().getClass().getName());
            System.out.println(person1.getFeeStructure().getClass().getName());
        }catch(Exception exception){
            exception.printStackTrace();
        }
    }
    }

