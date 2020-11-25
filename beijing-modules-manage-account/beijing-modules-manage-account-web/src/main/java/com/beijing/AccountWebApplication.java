package com.beijing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountWebApplication.class, args);
        System.out.println("===============accountWeb启动成功===============");
    }

}
