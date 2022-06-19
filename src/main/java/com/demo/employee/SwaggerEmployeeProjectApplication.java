package com.demo.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;
@EnableWebMvc
@SpringBootApplication
public class SwaggerEmployeeProjectApplication {

    @PostConstruct
    public void postConstruct() {
        System.out.println("This is the part which runs before the application start");
    }

    public static void main(String[] args) {
        SpringApplication.run(SwaggerEmployeeProjectApplication.class, args);
    }

}