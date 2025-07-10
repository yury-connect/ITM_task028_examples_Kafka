package com.example.kafka.kafkaDemo.repository;

import com.example.kafka.kafkaDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
