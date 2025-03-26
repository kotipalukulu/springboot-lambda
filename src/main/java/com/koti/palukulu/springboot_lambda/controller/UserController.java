package com.koti.palukulu.springboot_lambda.controller;

import com.koti.palukulu.springboot_lambda.dto.User;
import com.koti.palukulu.springboot_lambda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id")  Integer id){
        Optional<User> user = userService.getUser(id);
        if (user.isPresent())
        return ResponseEntity.status(HttpStatus.OK).body(user.get());
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());

    }
}
