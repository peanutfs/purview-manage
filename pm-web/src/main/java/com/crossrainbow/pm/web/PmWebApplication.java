package com.crossrainbow.pm.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.crossrainbow.pm")
@MapperScan(basePackages = "com.crossrainbow.pm.server.dao.mapper")
public class PmWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmWebApplication.class, args);
    }

}
