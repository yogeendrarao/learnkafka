package com.learn;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	 @KafkaListener(topics = "commentary")
	    public void consume(String msg) {
		 	System.out.println(String.format("->> %s", msg));
	    }
}
