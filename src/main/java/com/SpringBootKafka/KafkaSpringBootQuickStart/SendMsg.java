package com.SpringBootKafka.KafkaSpringBootQuickStart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//this is to send message from kafka producer

@RestController
@RequestMapping("kafka")
public class SendMsg {
	private ProducerApplication kproducer;
	@Autowired
	public SendMsg(ProducerApplication kproducer) {
		this.kproducer = kproducer;
	}
	
	@RequestMapping("/hi")
	public String Hi() {
		return "Hi";
	}
	@GetMapping("/publish")
	//QPkey is query-parameter key
	//http://localhost:8080/kafka/publish?message=hello
	public ResponseEntity<String> publish(@RequestParam("message") String msg){
		kproducer.sendmsg(msg);
		return ResponseEntity.ok("Message sent to the topic");
	}
	
}
