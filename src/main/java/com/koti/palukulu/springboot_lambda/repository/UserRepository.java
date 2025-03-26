package com.koti.palukulu.springboot_lambda.repository;


import com.koti.palukulu.springboot_lambda.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {


    Optional<User> findById(int id);
    List<User> findAll();
    User save(User user);



}
