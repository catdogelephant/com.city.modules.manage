package com.beijing.modules.manage.fengtai.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FengtaiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FengtaiServerApplication.class, args);
    }

}
