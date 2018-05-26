package com.example.samples.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentNegotiationController {

    @GetMapping
    public String index1() {
        return "Hello from version 1.";
    }

    @GetMapping(headers = "Accept=text/vnd.example.v2+plain")
    public String index2() {
        return "Hello from version 2.";
    }
}
