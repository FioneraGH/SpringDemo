package com.fionera.test.configure;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * SimpleConfigure
 * Created by fionera on 16-10-8.
 */
@Configuration
class SimpleConfigure
        implements CommandLineRunner {
    @Override
    public void run(String... strings) {
        System.out.println("I am running.");
    }
}
