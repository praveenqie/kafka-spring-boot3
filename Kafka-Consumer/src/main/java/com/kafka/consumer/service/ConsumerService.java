package com.kafka.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "user_container",groupId = "myGroup")
    public void consume(String data){
        LOGGER.info(String.format("Message received -> %s",data));
    }
}
