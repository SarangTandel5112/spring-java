package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext content = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) content.getBean("student");
        System.out.println(student);
    }
}
