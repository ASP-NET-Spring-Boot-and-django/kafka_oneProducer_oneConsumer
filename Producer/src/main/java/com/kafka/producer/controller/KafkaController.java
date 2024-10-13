package com.kafka.producer.controller;

import com.kafka.producer.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/send")
    public String sendMessage() {
        System.out.println("=============+++++++++++===============");

        kafkaProducer.sendMessage("my-topic", "vishal says hello!"+Math.random()*100);
        return "Message sent!";
    }
}
