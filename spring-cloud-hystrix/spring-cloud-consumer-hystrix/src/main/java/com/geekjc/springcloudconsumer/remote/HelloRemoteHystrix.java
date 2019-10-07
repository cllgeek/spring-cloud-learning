package com.geekjc.springcloudconsumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ll
 * @date 2019年10月07日 11:55 AM
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this message send failed ";
    }
}
