package com.example.epam_euroka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EpamEurokaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpamEurokaServerApplication.class, args);
    }

}