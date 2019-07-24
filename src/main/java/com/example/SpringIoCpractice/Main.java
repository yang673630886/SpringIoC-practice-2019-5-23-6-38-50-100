package com.example.SpringIoCpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }
    ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
    // 2.从容器中获取Bean实例
    HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
}