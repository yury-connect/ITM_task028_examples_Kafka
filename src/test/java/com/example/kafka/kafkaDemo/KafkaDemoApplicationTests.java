package com.example.kafka.kafkaDemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

//@SpringBootTest

//@SpringBootTest(
//		properties = {
//				"spring.profiles.active=test"
//		}
//)

@EnableAutoConfiguration(exclude = {
		DataSourceAutoConfiguration.class,
		KafkaAutoConfiguration.class
})

class KafkaDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
