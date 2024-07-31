package com.firstSpringProj.learning.spring.framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address){}
record Address (String firstLine, String city){}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public Person person(){
        return new Person("Kunal", 21, address());
    }
    @Bean (name = "address2")
    @Primary
    public Address address(){
        return new Address("BH1, Panjab University", "Chandigarh");
    }
    @Bean (name = "address3")
    public Address address3(){
        return new Address("Nashville","Tennessie");
    }
    @Bean (name = "address4")
    @Qualifier("address4Qualifier")
    public Address address4(){
        return new Address("Sunnyvale","California");
    }
    @Bean
    public String name(){
        return "Taylor Swift";
    }

    @Bean
    public int age(){
        return 32;
    }
    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(), new Address("Nashville","Tennessie"));
    }


//  Auto-wiring: Creating new Beans using existing Beans as a parameter as shown below :-
    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }
    @Bean
    public Person person4Parameters(String name, int age, @Qualifier("address4Qualifier") Address address4){
        return new Person(name, age, address4);
    }

}
