package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.hello.HelloService;

@SpringBootApplication
@RestController
public class MySpringBoot1Application {

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String index() {
        return helloService.sayHello();
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MySpringBoot1Application.class);
        app.setBanner(null);
        app.run(args);
    }
}
