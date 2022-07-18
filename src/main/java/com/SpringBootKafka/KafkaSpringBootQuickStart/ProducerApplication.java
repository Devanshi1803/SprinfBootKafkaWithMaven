package com.SpringBootKafka.KafkaSpringBootQuickStart;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerApplication {
	private KafkaTemplate<String,String> ktemplate;
	//spring boot provided logger to send msg. 
	private static final Logger logger = LoggerFactory.getLogger(ProducerApplication.class);
	public ProducerApplication(KafkaTemplate<String, String> ktemplate) {
		this.ktemplate = ktemplate;
	}
	
	public void sendmsg(String msg) {
		logger.info(String.format("Message sent: %s",msg)); 
		ktemplate.send("KafkaSpring", msg);
	}
}
