package com.geekjc.springcloudeuraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurakaApplication.class, args);
    }

}
