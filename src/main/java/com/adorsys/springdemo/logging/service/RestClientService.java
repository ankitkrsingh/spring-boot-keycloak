package com.adorsys.springdemo.logging.service;

import com.adorsys.springdemo.logging.entity.Todo;

import java.util.List;

public interface RestClientService {
    public String getTodos();
    public List<Todo> getTodosList();
}
