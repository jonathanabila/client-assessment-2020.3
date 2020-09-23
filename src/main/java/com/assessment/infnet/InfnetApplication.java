package com.assessment.infnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InfnetApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfnetApplication.class, args);
    }

}
