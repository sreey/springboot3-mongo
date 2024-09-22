package com.sree.mongo.sree_springboot_mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sree.mongo.sree_springboot_mongo.entity.User;


@Repository
public interface UserRepository extends MongoRepository<User, String>{
    
    public List<User> findByStudentId(String studentId);

}
