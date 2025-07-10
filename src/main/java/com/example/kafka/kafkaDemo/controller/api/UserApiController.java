package com.example.kafka.kafkaDemo.controller.api;

import com.example.kafka.kafkaDemo.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserApiController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("user", new User());
        return "index";
    }
}
