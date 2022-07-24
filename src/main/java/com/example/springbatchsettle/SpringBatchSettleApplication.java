package com.example.springbatchsettle;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchSettleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchSettleApplication.class, args);
    }

}
