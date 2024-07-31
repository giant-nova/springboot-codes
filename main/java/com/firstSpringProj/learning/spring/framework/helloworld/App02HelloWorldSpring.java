package com.firstSpringProj.learning.spring.framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

//  Configuring things we want spring manage by creating HelloWorldConfiguration class- @Configuration
//	and by annotating name class by - @Bean

//		Retrieving beans managed by Spring

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));

//		System.out.println(context.getBean(Address.class));

//			System.out.println(context.getBean("person4Parameters"));

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}