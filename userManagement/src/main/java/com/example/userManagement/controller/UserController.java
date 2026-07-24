package com.example.userManagement.controller;

import com.example.userManagement.entity.UserEntity;
import com.example.userManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3001")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    UserEntity newUser(@RequestBody UserEntity newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }
}
