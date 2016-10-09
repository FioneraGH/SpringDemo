package com.fionera.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by fionera on 16-10-9.
 */
@Component
@ConfigurationProperties(locations = {"classpath:custom.properties"},prefix = "app")
public class CustomBean {

    private String name;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
