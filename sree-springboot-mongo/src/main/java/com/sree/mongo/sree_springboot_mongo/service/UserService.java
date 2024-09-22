package com.sree.mongo.sree_springboot_mongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sree.mongo.sree_springboot_mongo.entity.User;
import com.sree.mongo.sree_springboot_mongo.repository.StudentRepository;
import com.sree.mongo.sree_springboot_mongo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepository;

    private final StudentRepository studentRepository;

    public User createUser(User user){
        studentRepository.save(user.getStudent());
        return userRepository.save(user);
    }

    public User getUserById(String userId){
        return userRepository.findById(userId).get();
    }

    public List<User> getUserByStudentId(String studentId){
        return userRepository.findByStudentId(studentId);
    }


}
