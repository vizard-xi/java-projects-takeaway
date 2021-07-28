package com.example.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NameConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NameConfig.class, args);

        NameConfig nameConfig = new NameConfig();
        nameConfig.getKelvin();
    }
}
