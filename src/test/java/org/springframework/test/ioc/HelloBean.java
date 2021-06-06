package org.springframework.test.ioc;

public class HelloBean {

    public String sayHello() {
        System.out.println("Hello");
        return "Hello";
    }
}
