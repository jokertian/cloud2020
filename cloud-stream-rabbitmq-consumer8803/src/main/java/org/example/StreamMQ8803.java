package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamMQ8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQ8803.class, args);
    }
}
