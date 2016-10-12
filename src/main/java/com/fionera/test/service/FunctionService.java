package com.fionera.test.service;

import org.springframework.stereotype.Service;

/**
 * Created by fionera on 16-10-8.
 */
@Service
public class FunctionService {

    public String sayHello(String userName){
        return "Hello," + userName + " " + this.hashCode();
    }
}
