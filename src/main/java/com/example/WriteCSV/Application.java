package com.example.WriteCSV;

import com.example.WriteCSV.service.WriteCSVService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
        WriteCSVService writeCSVService = new WriteCSVService();
        writeCSVService.writeCSV();
    }
}
