package com.anita.plagiarism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlagiarismApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlagiarismApplication.class, args);
    }

}
