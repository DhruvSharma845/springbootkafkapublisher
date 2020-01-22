package com.kafkaprac.springbootkafkapublisher.controller;

import com.kafkaprac.springbootkafkapublisher.streamclient.ApacheKafkaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/kafka")
public class PublisherController {

    @Autowired
    private ApacheKafkaClient kafkaClient;

    @PostMapping("/publish")
    public void sendMessage(@RequestBody String message) {
        this.kafkaClient.sendMessageToTopic(message);
    }

}
