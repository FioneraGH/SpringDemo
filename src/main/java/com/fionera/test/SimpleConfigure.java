package com.fionera.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by fionera on 16-10-8.
 */
@Component
class SimpleConfigure
        implements CommandLineRunner {
    @Autowired
    FunctionService functionService;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("I am running.");
    }
}
