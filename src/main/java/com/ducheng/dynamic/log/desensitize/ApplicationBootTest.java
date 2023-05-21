package com.ducheng.dynamic.log.desensitize;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class ApplicationBootTest {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBootTest.class);
    }
}
