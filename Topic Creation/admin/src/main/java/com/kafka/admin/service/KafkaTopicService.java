package com.kafka.admin.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.stereotype.Service;

@Service
public class KafkaTopicService {
    @Autowired
    private KafkaAdmin kafkaAdmin;

    public void createTopic(String topicName, int partitions, int replicationFactor) {
        NewTopic newTopic = new NewTopic(topicName, partitions, (short) replicationFactor);
        kafkaAdmin.createOrModifyTopics(newTopic);
        System.out.println("Topic created: " + topicName);
    }
}

