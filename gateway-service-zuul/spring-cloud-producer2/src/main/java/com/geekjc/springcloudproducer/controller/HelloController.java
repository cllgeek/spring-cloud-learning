package com.geekjc.springcloudproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ll
 * @date 2019年10月07日 10:48 AM
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello" + name + "，this is two message";
    }
}
