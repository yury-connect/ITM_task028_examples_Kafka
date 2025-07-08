package com.example.kafka.kafka_demo.controller.web;

import com.example.kafka.kafka_demo.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class UserController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }
}
