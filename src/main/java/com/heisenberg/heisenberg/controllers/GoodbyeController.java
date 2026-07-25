package com.heisenberg.heisenberg.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {
    @GetMapping("/bye")
    public String bye() {
        return "Goodbye from Spring Boot!";
    }
}
