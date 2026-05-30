package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot CI/CD is working 🚀";
    }
}
//mvn spring-boot:run "-Dspring-boot.run.arguments=--server.port=9090"