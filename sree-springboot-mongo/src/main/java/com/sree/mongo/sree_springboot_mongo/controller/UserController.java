package com.sree.mongo.sree_springboot_mongo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sree.mongo.sree_springboot_mongo.entity.User;
import com.sree.mongo.sree_springboot_mongo.service.UserService;

import lombok.RequiredArgsConstructor;




@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    
    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @GetMapping(value="/users", params = {"studentId"})
    public List<User> getUsersByStudentId(@RequestParam String studentId) {
        return userService.getUserByStudentId(studentId);
    }
    
    
}
