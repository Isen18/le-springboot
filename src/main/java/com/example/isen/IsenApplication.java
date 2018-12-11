package com.example.isen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.example.isen.mapper" })
public class IsenApplication {

    public static void main(String[] args) {
        SpringApplication.run(IsenApplication.class, args);
    }
}
