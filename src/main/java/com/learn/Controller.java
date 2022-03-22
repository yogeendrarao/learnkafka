package com.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	private final Producer producer;

    @Autowired
    Controller(Producer producer) {
        this.producer = producer;
    }
    
    @GetMapping("/")
    public String usePost() {
    	return "Use POST Method";
    }

    @PostMapping(value = "/")
    public void sendMessageToKafkaTopic(@RequestBody String message) {
        System.out.println(message);
        this.producer.sendMessage("commentary", message);
    }
}
