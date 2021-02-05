package com.adorsys.springdemo.logging.controller;

import com.adorsys.springdemo.logging.entity.Todo;
import com.adorsys.springdemo.logging.service.RestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodosController {

    @Autowired
    RestClientService restClientService;

    @GetMapping("/todos")
    public String getTodos() {
        return restClientService.getTodos();
    }

    @GetMapping("/todoslist")
    public List<Todo> getTodosList() {
        return restClientService.getTodosList();
    }
}
