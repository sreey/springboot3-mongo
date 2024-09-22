package com.sree.mongo.sree_springboot_mongo.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.sree.mongo.sree_springboot_mongo.entity.Student;
import com.sree.mongo.sree_springboot_mongo.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
    
    private final StudentRepository studentRepository;

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentsById(String studentId) {
        return studentRepository.findById(studentId).orElseThrow();
    }

    public List<Student> getStudentsByAgeAndName(Integer age, String name){
        return studentRepository.findByAgeAndName(age, name);
    }

    public void deleteStudentById(@PathVariable String studentId){
        studentRepository.deleteById(studentId);
    }

    public List<Student> getStudentsByPagination(int page, int size){
        Pageable pageable = PageRequest.of(page-1, size);
        return studentRepository.findAll(pageable).getContent();
    }

    public List<Student> getStudentsBySorting(String sortBy, Integer order){

        Sort sort = Sort.by(Sort.Direction.ASC, sortBy);
        return studentRepository.findAll(sort);
    }

}
