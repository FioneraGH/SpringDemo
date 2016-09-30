package com.fionera.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fionera on 16-9-29.
 */
@RestController
@EnableAutoConfiguration
public class SampleController { 

    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
}
