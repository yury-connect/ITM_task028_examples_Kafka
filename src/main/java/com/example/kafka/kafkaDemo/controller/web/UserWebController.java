package com.example.kafka.kafkaDemo.controller.web;

import com.example.kafka.kafkaDemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserWebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }
}
