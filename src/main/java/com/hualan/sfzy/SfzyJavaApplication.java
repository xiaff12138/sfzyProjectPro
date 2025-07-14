package com.hualan.sfzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SfzyJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfzyJavaApplication.class, args);
    }

}
