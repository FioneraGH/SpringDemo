package com.fionera.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * com.fionera.test.ApplicationTests
 * Created by fionera on 2018/3/1 in spring_demo.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("Context Loaded");
    }
}
