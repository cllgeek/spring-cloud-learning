package com.geekjc.springcloudconsumer.controller;

import com.geekjc.springcloudconsumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ll
 * @date 2019年10月07日 11:09 AM
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
