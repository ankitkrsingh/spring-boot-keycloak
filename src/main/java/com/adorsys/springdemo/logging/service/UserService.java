package com.adorsys.springdemo.logging.service;

import com.adorsys.springdemo.logging.entity.User;

public interface UserService {
    public User getUserById(Long id);

    public User createUser(User user);
}
