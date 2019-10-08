package com.geekjc.gatewayservicezuuleureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayServiceZuulSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceZuulEurekaApplication.class, args);
    }

}
