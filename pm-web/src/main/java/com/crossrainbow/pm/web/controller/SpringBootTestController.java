package com.crossrainbow.pm.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author:Peanutfs
 * @date:created in 11:54 2019/12/20
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class SpringBootTestController {

    @GetMapping("/h1")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
}
