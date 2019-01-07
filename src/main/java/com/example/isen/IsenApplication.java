package com.example.isen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan(basePackages = { "com.example.isen.mapper" })
@ImportResource("classpath:config/spring/*.xml")
public class IsenApplication {

    public static void main(String[] args) {
        SpringApplication.run(IsenApplication.class, args);
    }
}
