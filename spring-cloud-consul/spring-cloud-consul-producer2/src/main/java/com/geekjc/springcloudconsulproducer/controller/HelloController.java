package com.geekjc.springcloudconsulproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ll
 * @date 2019年10月10日 10:41 AM
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "helle consul two";
    }
}

