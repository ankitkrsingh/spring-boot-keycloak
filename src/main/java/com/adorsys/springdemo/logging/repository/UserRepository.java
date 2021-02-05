package com.adorsys.springdemo.logging.repository;

import com.adorsys.springdemo.logging.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
