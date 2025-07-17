package com.example.GymManagementSystem.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    @GetMapping("/dashboard")
    public String trainerDashboard() {
        return "Trainer dashboard - Access granted!";
    }
}

