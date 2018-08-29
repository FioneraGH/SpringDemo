package com.fionera.test;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * ServletInitializer
 *
 * @author fionera
 * @date 2018/8/30
 */
public class ServletInitializer
        extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        Object[] objects = new Object[1];
        objects[0] = Application.class;
        return builder.sources(objects);
    }
}
