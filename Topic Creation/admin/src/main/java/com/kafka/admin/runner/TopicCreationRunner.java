package com.kafka.admin.runner;

import com.kafka.admin.service.KafkaTopicService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TopicCreationRunner implements CommandLineRunner {
    private final KafkaTopicService kafkaTopicService;

    public TopicCreationRunner(KafkaTopicService kafkaTopicService) {
        this.kafkaTopicService = kafkaTopicService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("======================+++++++++++++++++=====");
        kafkaTopicService.createTopic("my-topic", 3, 1);
    }
}
