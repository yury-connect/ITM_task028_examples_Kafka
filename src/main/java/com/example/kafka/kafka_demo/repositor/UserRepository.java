package com.example.kafka.kafka_demo.repositor;

import com.example.kafka.kafka_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User, Long> {
}
