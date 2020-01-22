package com.kafkaprac.springbootkafkapublisher.streamclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ApacheKafkaClient {

    @Value("${kafka.topic1.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    public void sendMessageToTopic(String message) {
        this.kafkaTemplate.send(topicName, message);
    }
}
