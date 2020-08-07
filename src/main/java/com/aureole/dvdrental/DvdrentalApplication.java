package com.aureole.dvdrental;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.aureole.dvdrental.domain")
@SpringBootApplication
public class DvdrentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DvdrentalApplication.class, args);
    }

}
