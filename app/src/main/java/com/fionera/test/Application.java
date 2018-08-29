package com.fionera.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Application
 *
 * @author fionera
 * @date 16-10-8
 */
@SpringBootApplication
@MapperScan("com.fionera.test.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplicationBuilder().sources(Application.class)
                .bannerMode(Banner.Mode.OFF).build();
        app.run(args);
    }
}
