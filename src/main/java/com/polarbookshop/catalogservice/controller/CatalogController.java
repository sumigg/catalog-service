package com.polarbookshop.catalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @GetMapping("/greetings")
    String getGreetingMessage() {
        return "Welcome to PolarBook Shop";
    }

}
