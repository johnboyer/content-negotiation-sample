package com.example.samples.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.samples.web")
public class ContentNegotiationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentNegotiationApplication.class, args);
    }
}
