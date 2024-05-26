package com.kafka.producer.Controller;

import com.kafka.producer.dto.UserDate;
import com.kafka.producer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserInfoController {

    public static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    public UserService userService;

    @GetMapping("/user")
    public String produceUserInfo(@RequestBody UserDate userDate){
        LOGGER.info("Data is loaded here!");
        return userService.produceUserInfo(userDate);
    }
}
