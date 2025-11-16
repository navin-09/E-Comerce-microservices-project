package com.example.product_catalog_service.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FirstController {

    @GetMapping("/")
    public String Welcome() {
        return new String("Welcome to Spring Boot");
    }

}