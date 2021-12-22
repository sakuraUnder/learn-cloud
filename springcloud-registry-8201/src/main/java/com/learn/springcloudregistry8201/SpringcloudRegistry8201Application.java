package com.learn.springcloudregistry8201;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudRegistry8201Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRegistry8201Application.class, args);
    }

}
