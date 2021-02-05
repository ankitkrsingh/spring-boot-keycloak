package com.adorsys.springdemo.logging.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Todo {
    private Long userId;
    @Id
    private Long id;
    private String title;
    private boolean completed;
}
