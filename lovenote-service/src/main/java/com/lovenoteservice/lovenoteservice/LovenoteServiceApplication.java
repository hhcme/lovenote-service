package com.lovenoteservice.lovenoteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class LovenoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LovenoteServiceApplication.class, args);
    }

}
