package com.koti.palukulu.springboot_lambda.service;

import com.koti.palukulu.springboot_lambda.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    Optional<User> getUser(int id);
    List<User> getAllUsers();
    User create(User user);
}
