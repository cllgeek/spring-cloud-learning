package com.geekjc.springcloudclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ll
 * @date 2019年10月07日 8:31 PM
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${geekjc.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
