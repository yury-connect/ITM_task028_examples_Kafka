package com.example.kafka.kafkaDemo.config;

import com.example.kafka.kafkaDemo.util.FakeUserGenerator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@Getter
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {


    private final FakeUserGenerator generator;


    @Override
    public void run(String... args) {
        generator.generateUsers(10); // генерируем 10 пользователей
    }
}


