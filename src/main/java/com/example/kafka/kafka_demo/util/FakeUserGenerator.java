package com.example.kafka.kafka_demo.util;

import com.example.kafka.kafka_demo.model.User;
import com.example.kafka.kafka_demo.repository.UserRepository;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FakeUserGenerator {

    private final UserRepository userRepository;
    private final Faker faker = new Faker();

    public List<User> generateUsers(int count) {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            User user = new User();
            user.setFirstName(faker.name().firstName());
            user.setLastName(faker.name().lastName());
            user.setPatronymic(faker.name().nameWithMiddle());
            user.setUserName(faker.name().username());
            user.setPassword(faker.internet().password());
            user.setEmail(faker.internet().emailAddress());
            user.setAddress(faker.address().fullAddress());

            users.add(user);
        }

        return userRepository.saveAll(users);
    }
}

