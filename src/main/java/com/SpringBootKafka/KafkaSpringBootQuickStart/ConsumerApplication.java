package com.SpringBootKafka.KafkaSpringBootQuickStart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(ConsumerApplication.class);
	//following annotation is to subscribe for the topic
	//GroupId from application.properties
	@KafkaListener(topics = "KafkaSpring",groupId = "Group1")
	public void receivemsg(String msg) {
		logger.info(String.format("Message received: %s",msg));
		
	}
}
