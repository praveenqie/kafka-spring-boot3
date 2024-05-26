package com.kafka.producer.service.impl;

import com.kafka.producer.Controller.UserInfoController;
import com.kafka.producer.dto.UserDate;
import com.kafka.producer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public String produceUserInfo(UserDate userDate ) {
        kafkaTemplate.send("user_container","Paveenss");
        LOGGER.info("Data Is Here");
        return "Successfully produced a massage";
    }
}
