package com.sree.mongo.sree_springboot_mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sree.mongo.sree_springboot_mongo.entity.Student;


@Repository
public interface StudentRepository extends MongoRepository<Student, String>{
    
    public List<Student> findByAgeAndName(Integer age, String name);
}
