package com.example.kafka.kafka_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

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
