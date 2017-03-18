package com.fionera.test.configure;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * SimpleConfigure
 * Created by fionera on 16-10-8.
 */
@Component
class SimpleConfigure
        implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("I am running.");
    }
}
