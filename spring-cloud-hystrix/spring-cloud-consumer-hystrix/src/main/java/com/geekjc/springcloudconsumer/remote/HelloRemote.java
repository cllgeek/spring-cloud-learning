package com.geekjc.springcloudconsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ll
 * @date 2019年10月07日 11:06 AM
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
