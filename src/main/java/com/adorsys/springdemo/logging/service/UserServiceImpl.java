package com.adorsys.springdemo.logging.service;

import com.adorsys.springdemo.logging.entity.User;
import com.adorsys.springdemo.logging.exception.CustomException;
import com.adorsys.springdemo.logging.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new CustomException("Der User ist nicht vorhanden."));
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
