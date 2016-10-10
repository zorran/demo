package com.example.repository;

import com.example.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByLogin(String login);
}
