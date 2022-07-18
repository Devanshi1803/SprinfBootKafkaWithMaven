package com.SpringBootKafka.KafkaSpringBootQuickStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class KafkaSpringBootQuickStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringBootQuickStartApplication.class, args);
	}

}
