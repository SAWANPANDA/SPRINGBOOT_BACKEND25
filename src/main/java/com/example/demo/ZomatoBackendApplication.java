package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZomatoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZomatoBackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner demoData(RestaurantRepository repo) {
        return args -> {
            repo.save(new Restaurant(1, "Domino's", "Mumbai"));
            repo.save(new Restaurant(2, "Burger King", "Delhi"));
        };
    }
}
