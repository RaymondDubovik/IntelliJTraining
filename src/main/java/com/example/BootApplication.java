package com.example;

import javax.annotation.PostConstruct;

import com.example.service.SetupService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

    private final SetupService service;

    public BootApplication(SetupService service) {
        this.service = service;
    }

    @PostConstruct
    private void onApplicationStartup() {
        service.setupEntities();
    }

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
