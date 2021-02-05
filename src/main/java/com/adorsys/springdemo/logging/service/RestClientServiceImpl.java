package com.adorsys.springdemo.logging.service;

import com.adorsys.springdemo.logging.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestClientServiceImpl implements RestClientService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String getTodos() {
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", String.class);
    }

    @Override
    public List<Todo> getTodosList() {
        Todo[] todos = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", Todo[].class);
        return Arrays.asList(todos)
                .stream()
                .map(e -> {
                    if (e.getId() % 2 != 0) {
                        e.setTitle("angepasst");
                        e.setCompleted(true);
                    }
                    return e;
                })
                .collect(Collectors.toList());
    }
}
