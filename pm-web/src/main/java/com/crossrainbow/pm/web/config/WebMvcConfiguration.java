package com.crossrainbow.pm.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 18:31 2020/1/20
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/viewLogin").setViewName("login/login");
        registry.addViewController("/index").setViewName("common/index");
        registry.addViewController("/home").setViewName("common/home");
    }

}
