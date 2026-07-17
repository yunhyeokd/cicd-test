package com.kbinvestory.cicdtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String health() {
        return "Hello from Spring Boot! Deployed via GitHub Actions CI/CD 🚀";
    }
}