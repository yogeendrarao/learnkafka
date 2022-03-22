package com.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

	
    public void sendMessage(String Topic, String message) {
    	System.out.println(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(Topic, message);
    }
}
