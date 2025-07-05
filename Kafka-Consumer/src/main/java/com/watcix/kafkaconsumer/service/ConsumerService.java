package com.watcix.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "connection-consumer-group")
    public void listen(String message){
        System.out.println("Consumed message: " + message);
    }
}
