package com.kafka.producer.service;

import com.kafka.producer.dto.UserDate;

public interface UserService {
    public String produceUserInfo(UserDate userDate);
}
