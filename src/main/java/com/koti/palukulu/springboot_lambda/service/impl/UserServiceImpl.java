package com.koti.palukulu.springboot_lambda.service.impl;

import com.koti.palukulu.springboot_lambda.dto.User;
import com.koti.palukulu.springboot_lambda.repository.UserRepository;
import com.koti.palukulu.springboot_lambda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(int id){
        return userRepository.findById(id);

    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User create(User user){
        return userRepository.save(user);
    }
}
